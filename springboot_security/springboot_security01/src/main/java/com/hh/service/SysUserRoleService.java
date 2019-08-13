package com.hh.service;

import com.hh.mapper.SysUserRoleMapper;
import com.hh.entity.SysUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jitwxs
 * @date 2018/3/30 1:29
 */
@Service
public class SysUserRoleService {
    @Autowired
    private SysUserRoleMapper userRoleMapper;

    public List<SysUserRole> listByUserId(Integer userId) {
        return userRoleMapper.listByUserId(userId);
    }
}
