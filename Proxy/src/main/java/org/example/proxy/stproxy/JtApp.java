package org.example.proxy.stproxy;

/**
 * @author yu.wenhua
 * @desc 静态代理测试类
 * @date 2021/2/20 10:40
 */
public class JtApp {
    public static void main(String[] args) {
        UserDao target = new UserDao();
        UserDaoProxy proxy = new UserDaoProxy(target);
        proxy.save();//执行的是代理的方法
    }

}
