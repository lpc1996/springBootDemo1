package com.example.springbootdemo1.service;

import cn.hutool.core.date.DateUtil;
import cn.hutool.crypto.digest.DigestUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.example.springbootdemo1.mapper.UserMapper;
import com.example.springbootdemo1.model.Archive;
import com.example.springbootdemo1.model.User;
import com.example.springbootdemo1.model.pojo.MessageResponse;
import com.example.springbootdemo1.util.GlobalVariable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @package:com.example.springbootdemo1.service
 * @Author:旁观者
 * @Date:2022/5/14-14:08
 * @By:IntelliJ IDEA
 * @FileName:UserService.java
 */

@Slf4j
@Service
@Transactional
public class UserService {

    @Resource
    private UserMapper userMapper;
    @Resource
    private ArchiveService archiveService;

    public boolean hasUser(String userName){
//        QueryWrapper
//        userMapper.selectCount();
        return false;
    }

    public User getUserByUserName(String userName){

        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.eq(StringUtils.camelToUnderline(GlobalVariable.USERNAME),userName);
        User user = userMapper.selectOne(queryWrapper);
        return user;
    }

    public MessageResponse addUser(User user) {
        MessageResponse response = new MessageResponse();
        if(userMapper.insert(user) == 1){
            response.setCode(200  );
            response.setMessage("添加用户成功");
        }else{
            response.setCode(500);
            response.setMessage("添加用户失败");
        }
        return response;
    }

    public MessageResponse login(String userName, String password) {
        MessageResponse messageResponse = new MessageResponse();
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.eq(StringUtils.camelToUnderline(GlobalVariable.USERNAME),userName);
//        queryWrapper.eq(StringUtils.camelToUnderline(GlobalVariable.PASSWORD),password);
        User user = userMapper.selectOne(queryWrapper);
        if(user != null){
            if(user.getPass().equals(DigestUtil.md5Hex(password))){
                messageResponse.setCode(200);
                messageResponse.setMessage("登陆成功");
            }else{
                messageResponse.setCode(500);
                messageResponse.setMessage("登陆失败，登录密码错误");
            }
        }else {
            messageResponse.setCode(404);
            messageResponse.setMessage("登陆失败，找不到用户名为：" + userName + " 的用户账户！请重新输入正确的用户名或注册新用户！");
        }
        return messageResponse;
    }

    public MessageResponse delUser(User user){
        MessageResponse response = new MessageResponse();
        if( userMapper.deleteById(user) == 1 ){
            response.setCode(200);
            response.setMessage("删除用户成功");
        }else{
            response.setCode(500);
            response.setMessage("删除用户失败");
        }
        return response;
    }

    public MessageResponse register(User user, Archive archive) {
        user.setPass(DigestUtil.md5Hex(user.getPass()));
        user.setCreateTime(DateUtil.date());
        MessageResponse response = addUser(user);
        if(response.getCode() == 200){
            Long userId = getUserByUserName(user.getUserName()).getId();
            archive.setUserId(userId);
            user.setId(userId);
            if(archiveService.addArchive(archive).getCode() == 200 ){
                response.setMessage("用户注册成功");
                log.info("注册新用户："+user.getUserName()+"成功");
                return response;
            }else{
                delUser(user);
            }
        }
        response.setCode(500);
        response.setMessage("用户注册失败");
        return response;
    }
}
