package com.mooc.sb2.ioc.xml;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/2/18 1:26
 **/
public class HelloService {

    private Student student;

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
    }
}
