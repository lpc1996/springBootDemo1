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
 * @Date:2022/5/14-11:10
 * @By:IntelliJ IDEA
 * @FileName:Archive.java
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Archive extends MyModel{

    //用户Id
    @TableId(type = IdType.NONE)
    private Long userId;

    //性别
    private Integer sex;

    //年龄
    private Integer age;

    //政治面貌
    private Integer politic;

    //籍贯
    private String nation;

    //备注
    private String remark;
}