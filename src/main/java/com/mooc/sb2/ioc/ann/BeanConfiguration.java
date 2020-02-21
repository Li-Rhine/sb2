package com.mooc.sb2.ioc.ann;

import com.mooc.sb2.ioc.xml.Animal;
import com.mooc.sb2.ioc.xml.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/2/19 18:01
 **/
@Configuration
public class BeanConfiguration {

    @Bean("dog")
    Animal getDog() {
        return new Dog();
    }
}
