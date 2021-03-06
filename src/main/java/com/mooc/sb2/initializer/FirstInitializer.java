package com.mooc.sb2.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 16:16 2020/1/10
 */
@Order(1)
public class FirstInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        environment.setRequiredProperties("mooc");
//        Map<String, Object> map = new HashMap<>();
//        map.put("key1", "value1");
//        MapPropertySource mapPropertySource = new MapPropertySource("firstInitializer", map);
//        environment.getPropertySources().addLast(mapPropertySource);
//        System.out.println("run firstInitializer");
    }
}
