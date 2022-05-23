package com.example.springbootdemo1.service;

import com.example.springbootdemo1.mapper.ArchiveMapper;
import com.example.springbootdemo1.model.Archive;
import com.example.springbootdemo1.model.pojo.MessageResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @package:com.example.springbootdemo1.service
 * @Author:旁观者
 * @Date:2022/5/16-13:40
 * @By:IntelliJ IDEA
 * @FileName:ArchiveService.java
 */
@Slf4j
@Service
@Transactional
public class ArchiveService {

    @Resource
    private ArchiveMapper archiveMapper;

    public MessageResponse addArchive(Archive archive){
//        return ;
        MessageResponse response = new MessageResponse();
        if(archiveMapper.insert(archive) == 1){
            response.setCode(200);
            response.setMessage("成功添加用户档案");
        }
        else{
            response.setCode(500);
            response.setMessage("添加用户档案失败");
        }
        return response;
    }
}
