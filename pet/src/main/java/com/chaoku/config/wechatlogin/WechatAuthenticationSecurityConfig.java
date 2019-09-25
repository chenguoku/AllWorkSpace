package com.chaoku.config.wechatlogin;

import com.chaoku.common.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
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
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private RedisUtils redisUtils;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        WechatAuthenticationFilter wechatAuthenticationFilter = new WechatAuthenticationFilter();
        wechatAuthenticationFilter.setAuthenticationManager(http.getSharedObject(AuthenticationManager.class));
        wechatAuthenticationFilter.setAuthenticationSuccessHandler(wechatAuthenticationSuccessHandler);
        wechatAuthenticationFilter.setAuthenticationFailureHandler(wechatAuthenticationFailureHandler);

        WechatAuthenticationProvider wechatAuthenticationProvider = new WechatAuthenticationProvider();
        wechatAuthenticationProvider.setUserDetailsService(userDetailsService);

        http.authenticationProvider(wechatAuthenticationProvider)
                .addFilterBefore(new TokenCheckFilter(redisUtils),UsernamePasswordAuthenticationFilter.class)
                .addFilterAfter(wechatAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
    }
}
