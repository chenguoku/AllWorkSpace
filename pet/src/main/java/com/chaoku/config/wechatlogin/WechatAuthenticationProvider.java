package com.chaoku.config.wechatlogin;

import com.alibaba.fastjson.JSON;
import com.chaoku.common.utils.HttpClientTool;
import com.chaoku.config.LoginConstant;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.HashMap;
import java.util.Map;

/**
 * 短信登陆鉴权 Provider，要求实现 AuthenticationProvider 接口
 *
 * @author chenguoku
 * @since 2019/9/18
 */
public class WechatAuthenticationProvider implements AuthenticationProvider {
    @Value("${wechat.loginUrl}")
    private String wechatLoginUrl = "https://api.weixin.qq.com/sns/jscode2session";

    @Value("${wechat.appid}")
    private String appId = "wx97b2e296c734b8db";

    @Value("${wechat.secret}")
    private String secret = "f924e0e36e731396fabf5a5d7476325b";

    @Value("${wechat.grant_type}")
    private String grantType = "authorization_code";

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        WechatAuthenticationToken authenticationToken = (WechatAuthenticationToken) authentication;
        String code = String.valueOf(authentication.getCredentials());
        String userId = String.valueOf(authenticationToken.getPrincipal());

        //TODO 先留一个开口，回头去掉 调用微信的登录接口 验证code 是否正确
        String sessionKeyAndOpenId = "chen" + LoginConstant.SESSION_OPEN_SPLIT + "guo";
        if (StringUtils.equals(code,"admin")){

        }else {
            sessionKeyAndOpenId = checkCode(code);
        }

        String togetherString = sessionKeyAndOpenId + LoginConstant.SESSION_OPEN_USER_SPLIT + userId;

        UserDetails userDetails = userDetailsService.loadUserByUsername(togetherString);

        // 此时鉴权成功后，应当重新 new 一个拥有鉴权的 authenticationResult 返回
        WechatAuthenticationToken authenticationResult = new WechatAuthenticationToken(userDetails.getUsername(), userDetails.getPassword(), userDetails.getAuthorities());

        authenticationResult.setDetails(authenticationToken.getDetails());

        return authenticationResult;
    }

    private String checkCode(String code) {
        //请求微信登录链接
        Map<String, String> map = new HashMap<>();
        map.put("appid", appId);
        map.put("secret", secret);
        map.put("js_code", code);
        map.put("grant_type", grantType);
        String s = HttpClientTool.doGet(wechatLoginUrl, map);
        Map loginResultMap = JSON.parseObject(s, Map.class);

        if (loginResultMap.get("session_key") == null) {
            throw new BadCredentialsException("wechat login code error!");
        }

        String sessionKey = String.valueOf(loginResultMap.get("session_key"));
        String openId = String.valueOf(loginResultMap.get("openid"));

        return sessionKey + LoginConstant.SESSION_OPEN_SPLIT + openId;
    }


    @Override
    public boolean supports(Class<?> authentication) {
        // 判断 authentication 是不是 WechatAuthenticationToken 的子类或子接口
        return WechatAuthenticationToken.class.isAssignableFrom(authentication);
    }

    public UserDetailsService getUserDetailsService() {
        return userDetailsService;
    }

    public void setUserDetailsService(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }
}