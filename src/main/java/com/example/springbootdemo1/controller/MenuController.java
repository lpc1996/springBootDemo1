package com.example.springbootdemo1.controller;

import com.example.springbootdemo1.model.Menu;
import com.example.springbootdemo1.model.pojo.LayuiResponse;
import com.example.springbootdemo1.model.pojo.MessageResponse;
import com.example.springbootdemo1.service.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @package:com.example.springbootdemo1.controller
 * @Author:旁观者
 * @Date:2022/5/20-13:47
 * @By:IntelliJ IDEA
 * @FileName:MenuController.java
 */

@Slf4j
@RestController
@RequestMapping(value = "/sys/menu")
public class MenuController {

    @Resource
    private MenuService menuService;

//    @RequestMapping("/init")
//    public

    @RequestMapping("/")
    public ModelAndView menuView(ModelAndView view){
        view.setViewName("sys/menu");
        return view;
    }

    @PostMapping("/list")
    public LayuiResponse<Menu> list(){
        LayuiResponse<Menu> response = new LayuiResponse<Menu>();
        response.setData(menuService.getMenus());
        response.setCode(200);
        response.setCount(response.getData().size());
        response.setMessage("成功");
        return response;
    }

    @PostMapping("/add")
    public MessageResponse add(@RequestBody Menu menu){
        MessageResponse messageResponse = new MessageResponse();
        System.out.println(menu);
        if(menu == null){
            messageResponse.setCode(500);
            messageResponse.setMessage("未收到数据");
            return messageResponse;
        }
        if(menuService.addMenu(menu)){
            messageResponse.setCode(200);
            messageResponse.setMessage("添加菜单成功");
        }else{
            messageResponse.setCode(500);
            messageResponse.setMessage("添加菜单失败");
        }
        return messageResponse;
    }
}
