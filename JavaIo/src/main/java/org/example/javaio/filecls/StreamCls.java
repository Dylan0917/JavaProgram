package org.example.javaio.filecls;

import java.io.*;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName StreamCls.java
 * @Description TODO
 * @createTime 2021年02月21日 09:03:00
 */
public class StreamCls {
    /**
     * 中转站太小 速度慢
     */
    public void test01(){
        File file1 = new File("/Users/ywh/CODESRC/JavaProgram/JavaIo/src/main/resources/tfile1");
        File file2 = new File("/Users/ywh/CODESRC/JavaProgram/JavaIo/src/main/resources/tfile2.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file1);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            int n = fileInputStream.read();//中转站
            while (n != -1) {
                fileOutputStream.write(n);
                n = fileInputStream.read();
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //此处关闭流
        }
    }
    public void test02(){
        File file1 = new File("/Users/ywh/CODESRC/JavaProgram/JavaIo/src/main/resources/tfile1");
        File file2 = new File("/Users/ywh/CODESRC/JavaProgram/JavaIo/src/main/resources/tfile2.txt");
//        if (file2.exists())
//            file2.delete();
        try(FileInputStream fileInputStream = new FileInputStream(file1);
            FileOutputStream fileOutputStream = new FileOutputStream(file2,true);) {

            byte[] buf = new byte[1024]; //新中转站
//            int n = fileInputStream.read();//中转站
            int read = fileInputStream.read(buf);//读取
            while (read != -1) {
                fileOutputStream.write(buf,0,read);
                read = fileInputStream.read(buf);//读取
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //此处关闭流
            //使用自动资源释放后，此处不再需要关闭
        }
    }
}
