package com.mooc.sb2.ioc.ann;

import com.mooc.sb2.ioc.xml.Animal;
import com.mooc.sb2.ioc.xml.Cat;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/2/20 15:57
 **/
@Component
public class MyCat implements FactoryBean<Animal> {

    @Override
    public Animal getObject() throws Exception {
        return new Cat();
    }

    @Override
    public Class<?> getObjectType() {
        return Animal.class;
    }
}
