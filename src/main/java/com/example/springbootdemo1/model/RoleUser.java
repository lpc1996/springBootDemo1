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
 * @Date:2022/5/14-14:59
 * @By:IntelliJ IDEA
 * @FileName:Role_user.java
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class RoleUser extends MyModel{

    //id
    @TableId(type = IdType.AUTO)
    private Long id;

    //用户id
    private Long userId;

    //角色id
    private Integer roleID;

    //备注
    private String remark;
}
