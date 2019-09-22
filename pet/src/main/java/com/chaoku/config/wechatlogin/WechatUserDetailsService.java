package com.chaoku.config.wechatlogin;

import com.chaoku.config.LoginConstant;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * 自定义userDetailsService
 *
 * @author chenguoku
 * @since 2019/9/18
 */
@Service("userDetailsService")
public class WechatUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        String[] split = username.split(LoginConstant.SESSION_OPEN_USER_SPLIT);
        String sessionAndOpen = split[0];
        String userId = "";
        if (split.length > 1) {
            userId = split[1];
        }

        // 返回UserDetails实现类
        return new User(sessionAndOpen, userId, Collections.emptyList());
    }
}