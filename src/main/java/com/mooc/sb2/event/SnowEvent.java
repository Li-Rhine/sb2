package com.mooc.sb2.event;

import org.springframework.stereotype.Component;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/1/13 23:56
 **/
@Component
public class SnowEvent extends WeatherEvent {
    @Override
    public String getWeather() {
        return "snow";
    }
}
