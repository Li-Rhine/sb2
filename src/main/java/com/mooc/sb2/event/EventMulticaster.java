package com.mooc.sb2.event;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/1/14 0:01
 **/
public interface EventMulticaster {
    void multicastEvent(WeatherEvent event);

    void addListener(WeatherListener weatherListener);

    void removeListener(WeatherListener weatherListener);
}
