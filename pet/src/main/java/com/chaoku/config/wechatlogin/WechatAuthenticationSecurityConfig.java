package com.chaoku.config.wechatlogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

@Component
public class WechatAuthenticationSecurityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private WechatAuthenticationSuccessHandler wechatAuthenticationSuccessHandler;
    @Autowired
    private WechatAuthenticationFailureHandler wechatAuthenticationFailureHandler;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        WechatAuthenticationFilter wechatAuthenticationFilter = new WechatAuthenticationFilter();
        wechatAuthenticationFilter.setAuthenticationManager(http.getSharedObject(AuthenticationManager.class));
        wechatAuthenticationFilter.setAuthenticationSuccessHandler(wechatAuthenticationSuccessHandler);
        wechatAuthenticationFilter.setAuthenticationFailureHandler(wechatAuthenticationFailureHandler);

        WechatAuthenticationProvider wechatAuthenticationProvider = new WechatAuthenticationProvider();
        wechatAuthenticationProvider.setUserDetailsService(userDetailsService);

        http.authenticationProvider(wechatAuthenticationProvider)
                .addFilterAfter(wechatAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
    }
}
