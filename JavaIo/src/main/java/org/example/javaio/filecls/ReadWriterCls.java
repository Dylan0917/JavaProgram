package org.example.javaio.filecls;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ReadWriterCls.java
 * @Description TODO
 * @createTime 2021年02月21日 09:33:00
 */
public class ReadWriterCls {
    public void test01(){
        //字符流
        try (FileReader fileReader = new FileReader("/Users/ywh/CODESRC/JavaProgram/JavaIo/src/main/resources/tfile2.txt");
             FileWriter fileWriter = new FileWriter("/Users/ywh/CODESRC/JavaProgram/JavaIo/src/main/resources/tfile3.txt")) {
//            int read = fileReader.read();
//            while (read != -1){
//                fileWriter.write(read);
//            }
            char[] buf = new char[1024];
            int read = fileReader.read(buf);
            while (read != -1){
                fileWriter.write(buf,0,read);
                read = fileReader.read(buf);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
