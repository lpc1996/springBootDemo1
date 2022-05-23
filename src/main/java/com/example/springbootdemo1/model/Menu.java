package com.example.springbootdemo1.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @package:com.example.springbootdemo1.model
 * @Author:旁观者
 * @Date:2022/5/14-14:54
 * @By:IntelliJ IDEA
 * @FileName:Menu.java
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Menu extends MyModel{

    //菜单id
    @TableId(type = IdType.AUTO)
    private Integer id;

    //父级id
    private Integer pId;

    //菜单名称
    private String title;

    //地址
    private String href;

    //菜单打开方式
    private String target;

    //图标
    private String icon;

    //菜单类型
    private Integer type;

    //排序代码
    private Integer orderNum;
}
