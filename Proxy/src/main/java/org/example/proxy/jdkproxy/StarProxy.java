package org.example.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yu.wenhua
 * @desc 明星演出前需要有人收钱，由于要准备演出，自己不做这个工作，一般交给一个经纪人。
 * 便于理解，它的名字以Proxy结尾，但他不是代理类，原因是它没有实现我们的明星接口，无法对外服务，它仅仅是一个wrapper。
 * @date 2021/2/20 11:16
 */
public class StarProxy implements InvocationHandler {
    // 目标类，也就是被代理对象
    private Object target;

    public StarProxy(Object target) {
        this.target = target;
    }

    public StarProxy() {
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 这里可以做增强
        System.out.println("收钱。。。。。");
        Object invoke = method.invoke(target, args);
        System.out.println("处理后续事宜。。。。");
        return invoke;
    }

    /**
     * 方法CreatProxyedObj返回的对象才是我们的代理类，
     * 它需要三个参数，前两个参数的意思是在同一个classloader下通过接口创建出一个对象，该对象需要一个属性，也就是第三个参数，它是一个InvocationHandler。
     * 需要注意的是这个CreatProxyedObj方法不一定非得在我们的StarProxy类中，往往放在一个工厂类中。
     * @return
     */
    public Object createProxyObj(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }
}
