package com.mooc.sb2.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;

/**
 * @Author: dahai.li
 * @Description: 自定义监听器
 * @Date: Create in 17:30 2020/1/15
 */
@Order(1)
public class FirstListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("hello first");
    }
}
