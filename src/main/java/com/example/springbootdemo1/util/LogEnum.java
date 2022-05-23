package com.example.springbootdemo1.util;

/**
 * 本地日志枚举
 * @package:com.example.springbootdemo1.util
 * @Author:旁观者
 * @Date:2022/5/13-11:15
 * @By:IntelliJ IDEA
 * @FileName:LogEnum.java
 */
public enum LogEnum {

    BUSSINESS("bussiness"),

    PLATFORM("platform"),

    DB("db"),

    EXCEPTION("exception"),

    ;

    private String category;


    LogEnum(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
