package org.example.javaio.datacls;

import java.io.*;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName DataStreamCls.java
 * @Description TODO将引用数据类型或者基本数据类型写入到文件中并读取出来
 * @createTime 2021年02月21日 10:11:00
 */
public class DataStreamCls {

    public void test01(){

//        write();
        read();

    }
    public void write(){
        try {
            OutputStream outputStream = new FileOutputStream("/Users/ywh/CODESRC/JavaProgram/JavaIo/src/main/resources/tfile7");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            final DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
            dataOutputStream.writeInt(10);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeUTF("fdsfd");
            dataOutputStream.flush();
            dataOutputStream.close();
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
        try (FileInputStream fileInputStream = new FileInputStream("/Users/ywh/CODESRC/JavaProgram/JavaIo/src/main/resources/tfile7");
             final BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
             DataInputStream dataInputStream = new DataInputStream(bufferedInputStream)) {
            int i = dataInputStream.readInt();
            System.out.println(i);
            boolean b = dataInputStream.readBoolean();
            System.out.println(b);
            System.out.println(dataInputStream.readUTF());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
