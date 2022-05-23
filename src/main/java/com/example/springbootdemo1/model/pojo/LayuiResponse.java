package com.example.springbootdemo1.model.pojo;

import com.example.springbootdemo1.model.MyModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * layui表格插件数据结构
 * @package:com.lpc.module1.pojo
 * @Author:旁观者
 * @Date:2022/5/6-12:38
 * @By:IntelliJ IDEA
 * @FileName:LayuiRespone.java
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LayuiResponse <T extends MyModel> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer code = 0;

    private String message;

    private Integer count;

    private List<T> data;
}
