/**
 * @desc
 * @author yu.wenhua
 * @date 2021/2/20 13:45
 */
package org.example.reflection;
/**
 *反射
 * 类加载过程包括加载、验证、准备、解析和初始化五个阶段。
 * https://blog.csdn.net/wmq880204/article/details/113787470
 * 获取Class的方式
 * 1.
 * Person p = new Person();
 * Class c = p.getClass();
 * 2.
 * Class c2 = Person.class;
 * 3.
 * Class c3 = Class.forName("Person");
 *
 * Java的类加载器：
 * 1.启动（Bootstrap）类加载器：这个类加载器负责放在<JAVA_HOME>\lib目录中的，或者被-Xbootclasspath参数所指定的路径中的，并且是虚拟机识别的类库。用户无法直接使用。
 * 2.扩展（Extension）类加载器：这个类加载器由sun.misc.Launcher$AppClassLoader实现。它负责<JAVA_HOME>\lib\ext目录中的，或者被java.ext.dirs系统变量所指定的路径中的所有类库。用户可以直接使用。
 * 3.系统（System）类加载器：这个类由sun.misc.Launcher$AppClassLoader实现。是ClassLoader中getSystemClassLoader()方法的返回值。
 * 它负责用户路径（ClassPath）所指定的类库。用户可以直接使用。如果用户没有自己定义类加载器，默认使用这个。
 * 4.自定义加载器：用户自己定义的类加载器。
 *
 * getField和getDeclaredField的区别
 * getField 只能获取public的，包括从父类继承来的字段。
 * getDeclaredField 可以获取本类所有的字段，包括private的，但是不能获取继承来的字段。
 *
 *
 *
 */