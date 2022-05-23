package com.example.springbootdemo1.appenders;

import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.Property;
import org.apache.logging.log4j.core.config.plugins.Plugin;

import java.io.Serializable;

/**
 * 自定义log4j2日志输出源
 * @package:com.example.springbootdemo1.appenders
 * @Author:旁观者
 * @Date:2022/5/13-11:10
 * @By:IntelliJ IDEA
 * @FileName:MyLog4j2Addpender.java
 */

@Plugin(name="MyLog4j2",category = "Core",elementType = "appender",printObject = true)
public class MyLog4j2Addpender extends AbstractAppender {



    protected MyLog4j2Addpender(String name, Filter filter, Layout<? extends Serializable> layout, boolean ignoreExceptions, Property[] properties) {
        super(name, filter, layout, ignoreExceptions, properties);
    }

    @Override
    public void append(LogEvent event) {

    }
}
