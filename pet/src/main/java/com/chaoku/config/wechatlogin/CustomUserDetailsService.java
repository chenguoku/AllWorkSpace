package com.chaoku.config.wechatlogin;

import com.chaoku.modules.app.entity.UserEntity;
import com.chaoku.modules.app.service.UserService;
import jit.wxs.entity.SysRole;
import jit.wxs.entity.SysUser;
import jit.wxs.entity.SysUserRole;
import jit.wxs.service.SysRoleService;
import jit.wxs.service.SysUserRoleService;
import jit.wxs.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 自定义userDetailsService
 *
 * @author chenguoku
 * @since 2019/9/18
 */
@Service("userDetailsService")
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        // 从数据库中取出用户信息
        UserEntity userEntity = userService.selectByName(username);

        // 判断用户是否存在
        if (userEntity == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }

        // 返回UserDetails实现类
        return new User(user.getName(), user.getPassword(), authorities);
    }
}