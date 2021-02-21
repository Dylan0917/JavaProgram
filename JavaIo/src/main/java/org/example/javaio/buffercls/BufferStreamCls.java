package org.example.javaio.buffercls;

import java.io.*;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName BufferStreamCls.java
 * @Description TODO
 * @createTime 2021年02月21日 09:50:00
 */
public class BufferStreamCls {
    public void test01(){
        File file1 = new File("/Users/ywh/CODESRC/JavaProgram/JavaIo/src/main/resources/tfile1");
        File file2 = new File("/Users/ywh/CODESRC/JavaProgram/JavaIo/src/main/resources/tfile4.txt");
        try(FileInputStream fileInputStream = new FileInputStream(file1);
            FileOutputStream fileOutputStream = new FileOutputStream(file2,true);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {

            byte[] buf = new byte[1024];
            int read = bufferedInputStream.read(buf);
            while (read != -1){
                bufferedOutputStream.write(buf,0,read);
                read = bufferedInputStream.read(buf);
            }
            bufferedOutputStream.flush();

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
