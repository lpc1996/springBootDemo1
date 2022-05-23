package com.example.springbootdemo1.controller;

import com.example.springbootdemo1.model.pojo.MessageResponse;
import com.example.springbootdemo1.model.pojo.RegsiterForm;
import com.example.springbootdemo1.service.UserService;
import com.example.springbootdemo1.util.GlobalVariable;
import com.example.springbootdemo1.util.VerifyCodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @package:com.example.springbootdemo1.controller
 * @Author:旁观者
 * @Date:2022/5/14-12:14
 * @By:IntelliJ IDEA
 * @FileName:PageController.java
 */
@Controller
public class PageController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/index")
    public ModelAndView module(ModelAndView view){
        view.setViewName("index");
        return view;
    }

    @RequestMapping("/toLogin")
    public ModelAndView toLogin(ModelAndView view){
        view.setViewName("login");
        return view;
    }

    @RequestMapping("/loginErr")
    @ResponseBody
    public MessageResponse loginErr(){
        return new MessageResponse(0,"登陆失败");
    }

    @PostMapping("/login")
    @ResponseBody
    public MessageResponse login(HttpServletRequest request,HttpServletResponse response,
        @RequestParam(value = GlobalVariable.USERNAME,required = true) String userName,
         @RequestParam(value = GlobalVariable.PASSWORD,required = true) String password){
        MessageResponse messageResponse = userService.login(userName,password);
        return messageResponse;
    }

    @RequestMapping("/logout")
    public ModelAndView logout(ModelAndView view){
//        view.setViewName("redirect:/toLogin");
        return view;
    }

    @RequestMapping("/welcome")
    public ModelAndView welcome(ModelAndView view){
        view.setViewName("welcome");
        return view;
    }

    @RequestMapping(value = "/toRegister",method = RequestMethod.GET)
    public ModelAndView toRegister(ModelAndView view){
        view.setViewName("register");
        return view;
    }

    @PostMapping("/register")
    @ResponseBody
    public MessageResponse register(@RequestBody RegsiterForm regsiterForm){
        System.out.println(regsiterForm.getUser().toString());
        System.out.println(regsiterForm.getArchive().toString());
        MessageResponse messageResponse = userService.register(regsiterForm.getUser(),regsiterForm.getArchive());
        return messageResponse;
    }

    @RequestMapping("/getVerifyCode")
    public void getVerifyCode(HttpServletRequest request, HttpServletResponse response){
        try {
            ServletOutputStream out = response.getOutputStream();
            VerifyCodeUtil.createVerifyCode(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PostMapping("/verify")
    @ResponseBody
    public MessageResponse verify(@RequestParam("verifyCode") String verifyCode,HttpServletResponse response){
        System.out.println("验证码："+verifyCode);
        MessageResponse messageResponse = new MessageResponse();
        if(VerifyCodeUtil.verify(verifyCode)){
            messageResponse.setCode(200);
            messageResponse.setMessage("验证码输入正确");
        }else{
            messageResponse.setCode(0);
            messageResponse.setMessage("验证码错误,请输入正确的验证码！");
        }
        return messageResponse;
    }

}
