package org.example.proxy.stproxy;

/**
 * @author yu.wenhua
 * @desc 代理对象---静态代理
 * @date 2021/2/20 10:43
 */
public class UserDaoProxy implements IUserDao{

    //接收保存目标对象
    private IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    public UserDaoProxy() {
    }

    @Override
    public void save() {
        System.out.println("执行保存前逻辑...");
        target.save();
        System.out.println("执行保存后的逻辑...");
    }
}
