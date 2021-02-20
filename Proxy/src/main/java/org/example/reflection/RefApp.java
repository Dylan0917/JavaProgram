package org.example.reflection;

import org.example.reflection.bean.Person;

import java.lang.reflect.*;

/**
 * @author yu.wenhua
 * @desc
 * @date 2021/2/20 13:45
 */
public class RefApp {
    public static void main(String[] args) {

//        test01();
        test02();

    }
    public static void test01(){
        Class<Person> personClass = Person.class;
        try {
            Constructor<Person> constructor = personClass.getConstructor(int.class, String.class);
            Person tomcat = constructor.newInstance(10, "tomcat");
            //Person{age=10, name='tomcat'}
            System.out.println(tomcat.toString());
            System.out.println("*********************************");
            System.out.println("调用方法");
            Method show = personClass.getDeclaredMethod("toString");
            Object invoke = show.invoke(tomcat);
            //Person{age=10, name='tomcat'}
            System.out.println(invoke);
            System.out.println("*********************************");
            //调用私有属性，但是不能为私有属性赋值 getDeclaredConstructor
            Constructor<Person> constructor1 = personClass.getDeclaredConstructor(String.class);
            constructor1.setAccessible(true);//必须
            Person person = constructor1.newInstance("jerry");
            //Person{age=0, name='jerry'}
            System.out.println(person.toString());
            System.out.println("*********************************");
            //赋值私有属性
            Field name = personClass.getDeclaredField("name");
            name.setAccessible(true);
            name.set(person,"liudehua");
            //Person{age=0, name='liudehua'}
            System.out.println(person.toString());
            ClassLoader classLoader = RefApp.class.getClassLoader();

            //sun.misc.Launcher$AppClassLoader@18b4aac2 应用程序类加载器
            System.out.println(classLoader);

            ClassLoader classLoaderParent = classLoader.getParent();
            //sun.misc.Launcher$ExtClassLoader@7f31245a 扩张类加载器
            System.out.println(classLoaderParent);


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
    public static void test02(){
        Class<Person> personClass = Person.class;
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            //权限修饰符
            System.out.println(Modifier.toString(declaredField.getModifiers()));
            //变量类型
            Class<?> type = declaredField.getType();
            System.out.println(type);
            //变量名
            String name = declaredField.getName();
            System.out.println(name);

            //注解
//            Annotation[] annotations = declaredField.getAnnotations();
            MyAnnotation annotation1 = declaredField.getAnnotation(MyAnnotation.class);
            System.out.println(annotation1.value());
//            for (Annotation annotation : annotations) {
//                System.out.println(annotation);
//            }
        }
    }
}
