package com.example.springbootdemo1.service;

import com.example.springbootdemo1.mapper.MenuMapper;
import com.example.springbootdemo1.model.Menu;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @package:com.example.springbootdemo1.service
 * @Author:旁观者
 * @Date:2022/5/21-16:22
 * @By:IntelliJ IDEA
 * @FileName:MenuService.java
 */

@Service
@Transactional
public class MenuService {

    @Resource
    private MenuMapper menuMapper;

    public List<Menu> getMenus(){
//        QueryWrapper<Menu> wrapper = new QueryWrapper<Menu>();
////        wrapper.
        return menuMapper.selectList(null);
    }

    public boolean addMenu(Menu menu){
        return menuMapper.insert(menu) == 1;
    }

    public boolean updateMenu(Menu menu){
        return menuMapper.updateById(menu) == 1;
    }

    public boolean delMenu(Menu menu){
        return menuMapper.deleteById(menu) == 1;
    }
}
