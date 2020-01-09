package com.mooc.sb2.service;

import com.mooc.sb2.bean.Demo;
import com.mooc.sb2.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/1/10 2:07
 **/
@Component
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public Demo getDemoById(Long id){
        return Optional.ofNullable(demoMapper.selectByPrimaryKey(id)).orElse(null);
    }
}
