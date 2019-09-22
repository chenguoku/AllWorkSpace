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

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        logger.info("登录成功之后的处理");

        String username = String.valueOf(authentication.getPrincipal());
        String[] split = username.split(LoginConstant.SESSION_OPEN_SPLIT);
        String sessionKey = split[0];
        String openId = split[1];
        String userId = String.valueOf(authentication.getCredentials());

        response.getWriter().write(objectMapper.writeValueAsString(authentication));
    }

}