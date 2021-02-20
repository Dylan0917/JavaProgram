package org.example.reflection.bean;

import org.example.reflection.MyAnnotation;

/**
 * @author yu.wenhua
 * @desc
 * @date 2021/2/20 13:47
 */
public class Person {
    @MyAnnotation("age")
    private int age;
    @MyAnnotation
    public String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    private Person(String name) {
        this.name = name;
    }

    public Person() {
        System.out.println("Person无参数构造器。。。。");
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public void show(){
        System.out.println("是一个人");
    }
}
