package com.example.springbootdemo1.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @package:com.example.springbootdemo1.model.pojo
 * @Author:旁观者
 * @Date:2022/5/14-13:21
 * @By:IntelliJ IDEA
 * @FileName:MessageResponse.java
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageResponse{

    private Integer code;

    private String message;
}
