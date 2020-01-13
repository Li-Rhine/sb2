package com.mooc.sb2.event;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/1/13 23:58
 **/
public class SnowListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if(event instanceof SnowEvent) {
            System.out.println("hello" + event.getWeather());
        }
    }
}
