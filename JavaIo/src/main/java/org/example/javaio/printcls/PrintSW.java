package org.example.javaio.printcls;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName PrintSW.java
 * @Description TODO
 * @createTime 2021年02月21日 11:10:00
 */
public class PrintSW {
    public void test01(){
        try {
            PrintStream ps =
                    new PrintStream("/Users/ywh/CODESRC/JavaProgram/JavaIo/src/main/resources/tfile6");
            ps.print("fsdreewtewt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void test02(){
        final InputStream in = System.in;
        Scanner scanner = new Scanner(in);


        try (PrintWriter writer = new PrintWriter("/Users/ywh/CODESRC/JavaProgram/JavaIo/src/main/resources/tfile7");
            ) {
             String next1 = scanner.next();
            while (!"bye".equals(next1)){
                writer.write(next1);
                 next1 = scanner.next();
            }

            writer.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
