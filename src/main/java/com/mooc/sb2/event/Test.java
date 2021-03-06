package com.mooc.sb2.event;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/1/14 0:09
 **/
public class Test {

    public static void main(String[] args) {

        WeatherEventMulticaster eventMulticaster = new WeatherEventMulticaster();
        RainListener rainListener = new RainListener();
        SnowListener snowListener = new SnowListener();

        eventMulticaster.addListener(rainListener);
        eventMulticaster.addListener(snowListener);

        eventMulticaster.multicastEvent(new SnowEvent());
        eventMulticaster.multicastEvent(new RainEvent());
        eventMulticaster.removeListener(rainListener);
        eventMulticaster.multicastEvent(new SnowEvent());
        eventMulticaster.multicastEvent(new RainEvent());
    }
}
