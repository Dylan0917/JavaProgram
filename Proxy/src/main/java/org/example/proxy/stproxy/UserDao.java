package org.example.proxy.stproxy;

/**
 * @author yu.wenhua
 * @desc 静态代理-目标对象
 * @date 2021/2/20 10:42
 */
public class UserDao implements IUserDao{
    @Override
    public void save() {
        System.out.println("org.example.proxy.stproxy.UserDao implements IUserDao----已经保存数据!----");
    }
}
