package com.mooc.sb2.event;

import org.springframework.stereotype.Component;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/1/14 0:06
 **/
@Component
public class WeatherEventMulticaster extends AbstractEventMulticaster {


    @Override
    void doStart() {
        System.out.println("begin broadcast weather event");
    }

    @Override
    void doEnd() {
        System.out.println("end broadcast weather event");
    }
}
