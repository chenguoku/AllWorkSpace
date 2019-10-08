package com.chaoku.config.wechatlogin;

import com.alibaba.fastjson.JSON;
import com.chaoku.common.utils.*;
import com.chaoku.config.LoginConstant;
import com.chaoku.modules.app.dao.PetDao;
import com.chaoku.modules.app.entity.UserEntity;
import com.chaoku.modules.app.service.UserService;
import com.chaoku.modules.app.vo.pet.PetVo;
import com.chaoku.modules.app.vo.user.LoginVo;
import com.chaoku.modules.app.vo.user.TokenMappingVo;
import com.chaoku.modules.app.vo.user.UserVo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@Component
public class WechatAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    @Autowired
    private ObjectMapper objectMapper;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private UserService userService;

    @Autowired
    private PetDao petDao;

    @Autowired
    private JwtUtils jwtUtils;

    /**
     * 默认过期时长为72小时，单位：秒
     */
    public final static long TOKEN_EXPIRE = 60 * 60 * 72L;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        logger.info("登录成功之后的处理");
        LoginVo loginVo = new LoginVo();
        TokenMappingVo tokenMappingVo = new TokenMappingVo();

        String username = String.valueOf(authentication.getPrincipal());
        String[] split = username.split(LoginConstant.SESSION_OPEN_SPLIT);
        tokenMappingVo.setSessionKey(split[0]);
        tokenMappingVo.setOpenId(split[1]);

        String userId = String.valueOf(authentication.getCredentials());
        if (StringUtils.isNotEmpty(userId)) {
            UserEntity userEntity = userService.getById(userId);
            UserVo userVo = ConvertUtils.sourceToTarget(userEntity, UserVo.class);
            loginVo.setUserVo(userVo);
            tokenMappingVo.setUserVo(JSON.toJSONString(userVo));

            if (userEntity != null) {
                PetVo petVo = petDao.getPetVo(userEntity.getId());
                loginVo.setPetVo(petVo);
            }
        }

        //生成token
        String token = getRandomToken();
        loginVo.setToken(token);
        Map<String, Object> map = JSON.parseObject(JSON.toJSONString(tokenMappingVo), Map.class);
        redisUtils.hMSet(token, map, TOKEN_EXPIRE);

        response.setStatus(HttpStatus.OK.value());
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().write(objectMapper.writeValueAsString(new Result<>().ok(loginVo)));
    }

    private String getRandomToken() {
        String token = jwtUtils.generateToken(IdGenerator.defaultSnowflakeId());
        return token;
    }
}