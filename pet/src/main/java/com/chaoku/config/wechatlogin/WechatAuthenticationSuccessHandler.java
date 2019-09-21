package com.chaoku.config.wechatlogin;

import com.chaoku.config.LoginConstant;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Base64;

@Component
public class WechatAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    @Autowired
    private ObjectMapper objectMapper;

    private Logger logger = LoggerFactory.getLogger(getClass());

//    @Autowired
//    private AuthorizationServerTokenServices authorizationServerTokenServices;

//    @Autowired
//    private ClientDetailsService clientDetailsService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        logger.info("登录成功之后的处理");

        User authUser = (User) authentication.getPrincipal();
        String[] split = authUser.getUsername().split(LoginConstant.SESSION_OPEN_SPLIT);
        String sessionKey = split[0];
        String openId = split[1];
        String userId = authUser.getPassword();


        // token鉴权
//        String header = request.getHeader("Authorization");
//        if (header == null || !header.startsWith("Basic ")) {
//            throw new UnapprovedClientAuthenticationException("请求头中无client信息");
//        }
//        String[] tokens = extractAndDecodeHeader(header, request);
//        assert tokens.length == 2;
//        String clientId = tokens[0];
//        String clientSecret = tokens[1];
//        ClientDetails clientDetails = clientDetailsService.loadClientByClientId(clientId);
//        if (clientDetails == null) {
//            throw new UnapprovedClientAuthenticationException("clientId对应的配置信息不存在" + clientId);
//        }
//        if (!StringUtils.equals(clientDetails.getClientSecret(), clientSecret)) {
//            throw new UnapprovedClientAuthenticationException("clientSecret不匹配" + clientId);
//        }
//        TokenRequest tokenRequest = new TokenRequest(MapUtils.EMPTY_MAP, clientId, clientDetails.getScope(), "");
//        OAuth2Request oAuth2Request = tokenRequest.createOAuth2Request(clientDetails);
//        OAuth2Authentication oAuth2Authentication = new OAuth2Authentication(oAuth2Request, authentication);
//        OAuth2AccessToken oAuth2AccessToken = authorizationServerTokenServices.createAccessToken(oAuth2Authentication);
//        if (StringUtils.isNotEmpty(oAuth2AccessToken.getValue())) {
//            logger.info("{}登录成功", authentication.getName());
//            String tokenValue = oAuth2AccessToken.getValue();
//            logger.info("tokenValue------>{}", tokenValue);
//            response.setContentType("application/json;charset=UTF-8");
//            response.getWriter().write(objectMapper.writeValueAsString(tokenValue));
//        }
//
//
////        response.getWriter().write(objectMapper.writeValueAsString(new Result<>().ok(loginVo)));
//        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().write(objectMapper.writeValueAsString(authentication));
    }

    private String[] extractAndDecodeHeader(String header, HttpServletRequest request)
            throws IOException {

        byte[] base64Token = header.substring(6).getBytes("UTF-8");
        byte[] decoded;
        try {
            decoded = Base64.getDecoder().decode(base64Token);
        } catch (IllegalArgumentException e) {
            throw new BadCredentialsException(
                    "Failed to decode basic authentication token");
        }

        String token = new String(decoded, "UTF-8");

        int delim = token.indexOf(":");

        if (delim == -1) {
            throw new BadCredentialsException("Invalid basic authentication token");
        }
        return new String[]{token.substring(0, delim), token.substring(delim + 1)};
    }
}