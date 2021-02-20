package org.example.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author yu.wenhua
 * @desc cglib动态代理
 * @date 2021/2/20 11:36
 */
public class CglibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 这里增强
        System.out.println("org.example.proxy.cglibproxy.CglibProxy-收钱");
        return methodProxy.invokeSuper(o,objects);
    }
    //根据一个类型产生代理类，此方法不要求一定放在MethodInterceptor中
    public Object creatProxyedObj(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
}
