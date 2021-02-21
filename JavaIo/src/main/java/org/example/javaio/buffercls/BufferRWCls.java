package org.example.javaio.buffercls;

import java.io.*;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName BufferRWCls.java
 * @Description 字符流
 * @createTime 2021年02月21日 10:01:00
 */
public class BufferRWCls {

    public void test01(){
        File file1 = new File("/Users/ywh/CODESRC/JavaProgram/JavaIo/src/main/resources/tfile1");
        File file2 = new File("/Users/ywh/CODESRC/JavaProgram/JavaIo/src/main/resources/tfile5.txt");
        try(FileReader fileReader = new FileReader(file1);
            FileWriter fileWriter = new FileWriter(file2);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            String s = bufferedReader.readLine();
            while (s != null){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                s = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }




}
