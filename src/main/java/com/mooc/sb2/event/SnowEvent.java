package com.mooc.sb2.event;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/1/13 23:56
 **/
public class SnowEvent extends WeatherEvent {
    @Override
    public String getWeather() {
        return "snow";
    }
}
