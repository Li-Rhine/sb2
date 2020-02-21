package com.mooc.sb2.ioc.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/2/18 1:26
 **/
@Component
public class HelloService {

    private Student student;

    @Autowired
    @Qualifier("bird")
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String hello() {
        return animal.getName();
//        return "hello";
    }
}
