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
 * @Date:2022/5/14-15:01
 * @By:IntelliJ IDEA
 * @FileName:RoleMenu.java
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class RoleMenu extends MyModel{

    //id
    @TableId(type = IdType.AUTO)
    private Integer id;

    //角色id
    private Integer roleId;

    //权限id
    private Integer menuId;

    //备注
    private String remark;
}
