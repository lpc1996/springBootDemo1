package com.example.springbootdemo1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootdemo1.model.User;
import org.springframework.stereotype.Repository;

/**
 * @package:com.example.springbootdemo1.mapper
 * @Author:旁观者
 * @Date:2022/5/14-12:55
 * @By:IntelliJ IDEA
 * @FileName:UserMapper.java
 */

@Repository
public interface UserMapper extends BaseMapper<User> {


}
