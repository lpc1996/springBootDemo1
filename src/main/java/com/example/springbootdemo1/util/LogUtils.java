package com.example.springbootdemo1.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @package:com.example.springbootdemo1.util
 * @Author:旁观者
 * @Date:2022/5/13-11:16
 * @By:IntelliJ IDEA
 * @FileName:LogUtils.java
 */
public class LogUtils {

    /**
     * 获取业务日志logger
     *
     * @return
     */
    public static Logger getBussinessLogger() {
        return LoggerFactory.getLogger(LogEnum.BUSSINESS.getCategory());
    }

    /**
     * 获取平台日志logger
     *
     * @return
     */
    public static Logger getPlatformLogger() {
        return LoggerFactory.getLogger(LogEnum.PLATFORM.getCategory());
    }

    /**
     * 获取数据库日志logger
     *
     * @return
     */
    public static Logger getDBLogger() {
        return LoggerFactory.getLogger(LogEnum.DB.getCategory());
    }


    /**
     * 获取异常日志logger
     *
     * @return
     */
    public static Logger getExceptionLogger() {
        return LoggerFactory.getLogger(LogEnum.EXCEPTION.getCategory());
    }
}
