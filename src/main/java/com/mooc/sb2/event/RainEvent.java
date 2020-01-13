package com.mooc.sb2.event;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/1/13 23:57
 **/
public class RainEvent extends WeatherEvent {
    @Override
    public String getWeather() {
        return "rain";
    }
}
