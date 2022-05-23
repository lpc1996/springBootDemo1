package com.example.springbootdemo1.service;

import com.example.springbootdemo1.mapper.DictMapper;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @package:com.example.springbootdemo1.service
 * @Author:旁观者
 * @Date:2022/5/22-11:20
 * @By:IntelliJ IDEA
 * @FileName:DictService.java
 */

@Slf4j
@Service
@Transactional
public class DictService {

    @Resource
    private DictMapper dictMapper;
}
