package com.example.springbootdemo1.model.pojo;

import com.example.springbootdemo1.model.Archive;
import com.example.springbootdemo1.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @package:com.example.springbootdemo1.model.pojo
 * @Author:旁观者
 * @Date:2022/5/16-15:23
 * @By:IntelliJ IDEA
 * @FileName:RegsiterForm.java
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegsiterForm{

    private User user;

    private Archive archive;
}
