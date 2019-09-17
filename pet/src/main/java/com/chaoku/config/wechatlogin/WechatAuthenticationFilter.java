package com.chaoku.config.wechatlogin;

import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.util.Assert;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 短信登录的鉴权过滤器，模仿 UsernamePasswordAuthenticationFilter 实现
 *
 * @author chenguoku
 * @since 2019/9/18
 */
public class WechatAuthenticationFilter extends AbstractAuthenticationProcessingFilter {
    /**
     * form表单中 微信用户信息Key
     */
    public static final String USER_ID_KEY = "userId";

    /**
     * form表单中微信小程序登录code
     */
    public static final String CODE = "code";

    /**
     * 是否仅 POST 方式
     */
    private boolean postOnly = true;

    public WechatAuthenticationFilter() {
        // 微信登录的请求 post 方式的 /user/login
        super(new AntPathRequestMatcher("/user/login", "POST"));
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        if (postOnly && !request.getMethod().equals("POST")) {
            throw new AuthenticationServiceException(
                    "Authentication method not supported: " + request.getMethod());
        }

        String userId = obtainUserId(request);
        String code = obtainCode(request);

        if (userId == null) {
            userId = "";
        }
        if (code == null) {
            code = "";
        }

        userId = userId.trim();
        code = code.trim();

        WechatAuthenticationToken authRequest = new WechatAuthenticationToken(userId,code);

        // Allow subclasses to set the "details" property
        setDetails(request, authRequest);

        return this.getAuthenticationManager().authenticate(authRequest);
    }

    protected String obtainUserId(HttpServletRequest request) {
        return request.getParameter(USER_ID_KEY);
    }

    protected String obtainCode(HttpServletRequest request) {
        return request.getParameter(CODE);
    }

    protected void setDetails(HttpServletRequest request, WechatAuthenticationToken authRequest) {
        authRequest.setDetails(authenticationDetailsSource.buildDetails(request));
    }

    public void setPostOnly(boolean postOnly) {
        this.postOnly = postOnly;
    }
}
