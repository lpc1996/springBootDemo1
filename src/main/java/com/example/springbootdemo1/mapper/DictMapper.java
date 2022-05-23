package com.example.springbootdemo1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootdemo1.model.Dict;
import org.springframework.stereotype.Repository;

/**
 * @package:com.example.springbootdemo1.mapper
 * @Author:旁观者
 * @Date:2022/5/14-16:37
 * @By:IntelliJ IDEA
 * @FileName:DictMapper.java
 */

@Repository
public interface DictMapper extends BaseMapper<Dict> {
}
