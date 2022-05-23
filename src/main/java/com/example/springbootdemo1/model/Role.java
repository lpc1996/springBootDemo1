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
 * @Date:2022/5/14-14:35
 * @By:IntelliJ IDEA
 * @FileName:Role.java
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Role extends MyModel{

    //id
    @TableId(type = IdType.AUTO)
    private Integer id;

    //角色名
    private String name;

    //备注
    private String remark;
}
