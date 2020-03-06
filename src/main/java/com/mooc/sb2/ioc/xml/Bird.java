package com.mooc.sb2.ioc.xml;

import org.springframework.stereotype.Component;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/2/20 16:25
 **/
@Component
public class Bird extends Animal{
    @Override
    String getName() {
        return "bird";
    }
}
