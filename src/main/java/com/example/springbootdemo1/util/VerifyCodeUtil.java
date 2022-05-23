package com.example.springbootdemo1.util;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.captcha.generator.RandomGenerator;

import javax.servlet.ServletOutputStream;

/**
 * @package:com.example.springbootdemo1.util
 * @Author:旁观者
 * @Date:2022/5/14-15:31
 * @By:IntelliJ IDEA
 * @FileName:VerifyCodeUtil.java
 */
public class VerifyCodeUtil {

    private static final String str = "23456789ABCdefghDEFGHJpPQRVWXYZabcjkTUmnqrtKMNvuwxyz";

    private static String currVerifyCode;

    public static void createVerifyCode(ServletOutputStream outputStream){
        int width = 100;
        int height = 36;

        RandomGenerator randomGenerator = new RandomGenerator(str,4);
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(width,height);
        lineCaptcha.setGenerator(randomGenerator);
        lineCaptcha.createCode();
        currVerifyCode = lineCaptcha.getCode();
        lineCaptcha.write(outputStream);
    }

    public static Boolean verify(String verifyCode){
        return currVerifyCode.equalsIgnoreCase(verifyCode);
    }
}
