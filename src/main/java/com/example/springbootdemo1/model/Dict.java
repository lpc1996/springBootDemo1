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
 * @Date:2022/5/14-15:04
 * @By:IntelliJ IDEA
 * @FileName:Dict.java
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Dict extends MyModel{

    //id
    @TableId(type = IdType.AUTO)
    private Integer id;

    //字典名称
    private String name;

    //类型代码
    private String typeCode;

    //字典值
    private String value;

    //排序代码
    private Integer orderNum;

    //备注
    private String remark;
}
