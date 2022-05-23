//package com.example.springbootdemo1.service;
//
//import com.example.springbootdemo1.mapper.UserMapper;
//import com.example.springbootdemo1.model.Role;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//import java.util.ArrayList;
//import java.util.Collection;
//
///**
// * @package:com.example.springbootdemo1.service
// * @Author:旁观者
// * @Date:2022/5/14-13:28
// * @By:IntelliJ IDEA
// * @FileName:UserDetailService.java
// */
//@Log4j2
////@Service
////@Component
//public class UserDetailService implements UserDetailsService {
//
//    @Resource
//    private UserService userService;
//    @Resource
//    private RoleService roleService;
//    @Resource
//    private PasswordEncoder passwordEncoder;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        System.out.println("UserDetailService,userName="+username);
//        Collection<GrantedAuthority> authorities = new ArrayList<>();
//        com.example.springbootdemo1.model.User user = userService.getUserByUserName(username);
//        if(user == null){
//            throw new UsernameNotFoundException("用户名不存在");
//        }
//        Role role = roleService.getRoleByUserName(username);
//        String pass = passwordEncoder.encode(user.getPass());
//        authorities.add(new SimpleGrantedAuthority(role.getName()));
//        return new User(user.getUserName(),user.getPass(),authorities);
//    }
//}
