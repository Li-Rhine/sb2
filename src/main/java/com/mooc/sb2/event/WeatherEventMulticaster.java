package com.mooc.sb2.event;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/1/14 0:06
 **/
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
