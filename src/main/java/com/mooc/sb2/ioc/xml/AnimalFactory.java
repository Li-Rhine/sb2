package com.mooc.sb2.ioc.xml;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/2/18 1:44
 **/
public class AnimalFactory {

    public Animal getAnimal(String type) {
        if ("dog".equals(type)) {
            return new Dog();
        }else {
            return new Cat();
        }
    }
}
