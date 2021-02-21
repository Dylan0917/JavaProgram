package org.example.javaio.datacls;

import java.io.*;
import java.util.Date;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ObjStreamCls.java
 * @Description TODO
 * @createTime 2021年02月21日 10:32:00
 */
public class ObjStreamCls {

    public void test01(){

//        write();
        read();

    }
    public void write(){
        try {
            OutputStream outputStream = new FileOutputStream("/Users/ywh/CODESRC/JavaProgram/JavaIo/src/main/resources/tfile8");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
            objectOutputStream.writeObject(new Date());
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读和写读顺序必须一致，否则无法读取
     */
    public void read(){
        try (FileInputStream fileInputStream = new FileInputStream("/Users/ywh/CODESRC/JavaProgram/JavaIo/src/main/resources/tfile8");
             final BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
             ObjectInputStream dataInputStream = new ObjectInputStream(bufferedInputStream)) {
            final Object o = dataInputStream.readObject();
            System.out.println(o);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
