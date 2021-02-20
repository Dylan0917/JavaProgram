package org.example.proxy.jdkproxy;

/**
 * @author yu.wenhua
 * @desc
 * @date 2021/2/20 10:58
 */
public class JpApp {
    public static void main(String[] args) {
        Star ldh = new LiuDeHua();
        StarProxy proxy = new StarProxy(ldh);
        Object o = proxy.createProxyObj();
        Star star = (Star) o;
        star.dance();

    }
}
