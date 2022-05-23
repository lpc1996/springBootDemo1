package com.example.springbootdemo1.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @package:com.example.springbootdemo1.model
 * @Author:旁观者
 * @Date:2022/5/13-23:08
 * @By:IntelliJ IDEA
 * @FileName:User.java
 */

@Data
@TableName("user")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class User extends MyModel{

    //用户编号
    @TableId(type = IdType.AUTO)
    private Long id;

    //用户名
    private String userName;

    //用户昵称
    private String nickName;

    //用户类型
    private Integer type;

    //登录密码
    private String pass;

    //用户状态
    private Integer status;

    //创建时间
    private Date createTime;
}
