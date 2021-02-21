/**
 * @ClassName package-info.java
 * @author admin
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年02月20日 21:03:00
 */
package org.example.javaio;
/**
 * https://blog.csdn.net/jingzi123456789/article/details/72123937
 * 流分类
 * 按处理数据单位不同：字节流、字符流
 * 按功能不同：节点流，处理流。
 * （1）程序用于直接操作目标设备所对应的类叫节点流。
 * （2）程序通过一个间接流类去调用节点流类，以达到更加灵活方便地读写各种类型的数据，这个间接流类就是处理流。
 *
 *
 *从 Java 7 build 105 版本开始，Java 7 的编译器和运行环境支持新的 try-with-resources 语句，称为 ARM 块(Automatic Resource Management) ，自动资源管理。
 *
 * try()中的资源必须是实现了java.lang.AutoCloseable或java.io.Closeable的类。
 * try语句块中可以声明一个或多个resources,不管try语句是正常完成还是抛异常,资源在执行完try语句块都会关闭。
 * try-with-resources语句包含多个资源的时候，资源的close方法的调用顺序与它们的创建顺序相反。
 * 注意:带有资源的try语句可以像一般的try语句一样具有catch和finally块。在try-with-resources语句中，
 * 任何catch或finally块都是在声明的资源被关闭后才会执行的。
 *try(FileInputStream fileInputStream = new FileInputStream(file1);
 *             FileOutputStream fileOutputStream = new FileOutputStream(file2,true);) {
 *
 *
 *
 */
