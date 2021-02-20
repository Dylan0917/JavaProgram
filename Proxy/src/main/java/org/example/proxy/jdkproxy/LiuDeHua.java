package org.example.proxy.jdkproxy;

/**
 * @author yu.wenhua
 * @desc
 * @date 2021/2/20 11:14
 */
public class LiuDeHua implements Star{
    @Override
    public String sing() {
        System.out.println("刘德华-给我一杯忘情水");
        return "唱完" ;
    }

    @Override
    public String dance() {
        System.out.println("刘德华-开心的马骝");
        return "跳完" ;
    }
}
