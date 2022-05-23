package com.example.springbootdemo1.controller;

import com.example.springbootdemo1.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @package:com.example.springbootdemo1.controller
 * @Author:旁观者
 * @Date:2022/5/14-13:04
 * @By:IntelliJ IDEA
 * @FileName:UserController.java
 */

@Slf4j
@Controller
@RequestMapping(value = "/sys")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/user")
    public ModelAndView view(ModelAndView view){
        view.setViewName("sys/user");
        return view;
    }
}
