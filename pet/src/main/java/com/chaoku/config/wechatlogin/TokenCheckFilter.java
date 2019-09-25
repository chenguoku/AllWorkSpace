package com.chaoku.config.wechatlogin;

import com.alibaba.fastjson.JSON;
import com.chaoku.common.utils.RedisUtils;
import com.chaoku.common.utils.Result;
import org.apache.commons.lang3.StringUtils;
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
public class TokenCheckFilter extends OncePerRequestFilter {

    private static final String FILTER_APPLIED = "__spring_security_tokenCheckFilter_filterApplied";

    public TokenCheckFilter(RedisUtils redisUtils) {
        this.redisUtils = redisUtils;
    }

    private RedisUtils redisUtils;

    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain)
            throws ServletException, IOException {

        if (!(antPathMatcher.match("/**/*.js", httpServletRequest.getRequestURI()) ||
                antPathMatcher.match("/**/*.css", httpServletRequest.getRequestURI()) ||
                antPathMatcher.match("/swagger-resources/**", httpServletRequest.getRequestURI()) ||
                antPathMatcher.match("/v2/**", httpServletRequest.getRequestURI()) ||
                antPathMatcher.match("/**/*.html", httpServletRequest.getRequestURI()) ||
                antPathMatcher.match("/**/*.gif", httpServletRequest.getRequestURI()) ||
                antPathMatcher.match("/**/*.ico", httpServletRequest.getRequestURI()) ||
                antPathMatcher.match("/**/*.ttf", httpServletRequest.getRequestURI()) ||
                antPathMatcher.match("/**/*.png", httpServletRequest.getRequestURI())
        )) {

            String url = httpServletRequest.getRequestURI();
            String method = httpServletRequest.getMethod();

            if (!StringUtils.equals(url, "/user/login") && !StringUtils.equals(method, "POST")) {
                String token = httpServletRequest.getHeader("token");
                if (token == null || StringUtils.isEmpty(token)) {
                    httpServletResponse.getWriter().write(JSON.toJSONString(new Result<>().error("Token cannot be null!")));
                    return;
                } else {
                    Object o = redisUtils.get(token);
                    if (o == null) {
                        httpServletResponse.getWriter().write(JSON.toJSONString(new Result<>().error("Token error!")));
                        return;
                    }
                }
            }

        }

        filterChain.doFilter(httpServletRequest, httpServletResponse);

    }
}
