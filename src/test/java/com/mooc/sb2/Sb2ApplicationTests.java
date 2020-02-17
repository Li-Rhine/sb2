package com.mooc.sb2;

import com.mooc.sb2.event.WeatherRunListenter;
import com.mooc.sb2.ioc.xml.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(locations = "classpath:ioc/demo.xml")
public class Sb2ApplicationTests {

    @Autowired
    private HelloService helloService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testHello(){
        System.out.println(helloService.hello());
    }

}
