package org.example.reflection;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author yu.wenhua
 * @desc
 * @date 2021/2/20 17:21
 */
public class ClsLoaderApp {
    public static void main(String[] args) {
        Properties properties = new Properties();
        //使用类加载器读取配置文件
        InputStream resourceAsStream = ClsLoaderApp.class.getClassLoader().getResourceAsStream("jdbc.properties");
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String user = properties.getProperty("user");
        System.out.println(user);
    }
}
