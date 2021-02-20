package org.example.proxy.cglibproxy;

import org.example.proxy.jdkproxy.LiuDeHua;
import org.example.proxy.jdkproxy.Star;

/**
 * @author yu.wenhua
 * @desc cglib动态代理
 * @date 2021/2/20 11:32
 */
public class CgApp {
    public static void main(String[] args) {
        Star star = new LiuDeHua();
        CglibProxy cglibProxy = new CglibProxy();
        Object o = cglibProxy.creatProxyedObj(star.getClass());
        Star proxy = (Star) o;
        System.out.println(proxy.dance());
    }
}
