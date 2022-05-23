package com.example.springbootdemo1.service;

import com.example.springbootdemo1.mapper.RoleMapper;
import com.example.springbootdemo1.model.Role;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @package:com.example.springbootdemo1.service
 * @Author:旁观者
 * @Date:2022/5/14-16:07
 * @By:IntelliJ IDEA
 * @FileName:RoleService.java
 */

@Service
@Transactional
public class RoleService {

    @Resource
    private RoleMapper roleMapper;

    public Role getRoleByUserName(String userName){
        return roleMapper.selectRoleByUserName(userName);
    }
}
