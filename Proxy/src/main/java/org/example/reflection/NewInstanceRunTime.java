package org.example.reflection;

import org.example.reflection.bean.Person;

import java.util.Random;

/**
 * @author yu.wenhua
 * @desc 创建运行时类的对象
 * @date 2021/2/20 17:29
 */
public class NewInstanceRunTime {
    public static void main(String[] args) {
//        test01();
        test02();
    }
    public static void test01(){
        Class<Person> personClass = Person.class;
        try {
            Person person = personClass.newInstance();
//            Person无参数构造器。。。。
//            Person{age=0, name='null'}
            System.out.println(person.toString());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * 动态性
     */
    public static void test02(){
        int num = new Random().nextInt(3);
        String clspath = "";
        switch (num) {
            case 0:
                clspath = "java.util.Date";
                break;
            case 1:
                clspath = "java.lang.Object";
                break;
            case 2:
                clspath = "org.example.reflection.bean.Person";
        }


        Object instance = null;
        try {
            instance = getInstance(clspath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instance);

    }
    public static Object getInstance(String classpath) throws Exception {
        Class<?> aClass = Class.forName(classpath);
        Object o = aClass.newInstance();
        return o;
    }
}
