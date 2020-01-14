package com.mooc.sb2.event;

import org.springframework.stereotype.Component;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/1/14 0:00
 **/
@Component
public class RainListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof RainEvent) {
            System.out.println("hello" + event.getWeather());
        }
    }
}
