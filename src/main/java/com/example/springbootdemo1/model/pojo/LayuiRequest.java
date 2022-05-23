package com.example.springbootdemo1.model.pojo;

import com.example.springbootdemo1.model.MyModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @package:com.lpc.module1.pojo
 * @Author:旁观者
 * @Date:2022/5/6-12:44
 * @By:IntelliJ IDEA
 * @FileName:LayuiRequest.java
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class LayuiRequest <T extends MyModel> implements Serializable {

    private static final long serialVersionUID = 1L;

    private int page;

    private int nums;

    private T searchParams;
}
