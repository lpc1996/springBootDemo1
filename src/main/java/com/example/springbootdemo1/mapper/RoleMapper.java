package com.example.springbootdemo1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootdemo1.model.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @package:com.example.springbootdemo1.mapper
 * @Author:旁观者
 * @Date:2022/5/14-16:35
 * @By:IntelliJ IDEA
 * @FileName:RoleMapper.java
 */

@Repository
public interface RoleMapper extends BaseMapper<Role> {

    Role selectRoleByUserName(@Param("userName") String userName);
}