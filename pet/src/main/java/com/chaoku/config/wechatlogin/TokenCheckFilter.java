package com.chaoku.config.wechatlogin;

import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName TokenCheckFilter.java
 * @Description token拦截
 * @createTime 2019年09月22日 23:57:00
 */
@Component("tokenCheckFilter")
public class TokenCheckFilter extends OncePerRequestFilter {

    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain)
            throws ServletException, IOException {

        if (!(antPathMatcher.match("/**/*.js",httpServletRequest.getRequestURI()) ||
                antPathMatcher.match("/**/*.css",httpServletRequest.getRequestURI()) ||
                antPathMatcher.match("/swagger-resources/**",httpServletRequest.getRequestURI()) ||
                antPathMatcher.match("/v2/**",httpServletRequest.getRequestURI()) ||
                antPathMatcher.match("/**/*.html",httpServletRequest.getRequestURI()) ||
                antPathMatcher.match("/**/*.gif",httpServletRequest.getRequestURI()) ||
                antPathMatcher.match("/**/*.ico",httpServletRequest.getRequestURI()) ||
                antPathMatcher.match("/**/*.ttf",httpServletRequest.getRequestURI()) ||
                antPathMatcher.match("/**/*.png",httpServletRequest.getRequestURI())
        )){
            String url = httpServletRequest.getRequestURI();
            String method = httpServletRequest.getMethod();
            if (antPathMatcher.match("/",httpServletRequest.getRequestURI())){
                System.out.println("拦截成功");
            }
        }

        filterChain.doFilter(httpServletRequest,httpServletResponse);

    }
}
