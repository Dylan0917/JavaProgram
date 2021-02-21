package org.example.javaio.filecls;

import java.io.File;
import java.io.IOException;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName FileCls.java
 * @Description TODO
 * @createTime 2021年02月21日 08:41:00
 */
public class FileCls {

    public void test01(){
        File file = new File("tfile1.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.getTotalSpace());
        System.out.println(file.canWrite());
        System.out.println(file.canRead());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        //如果时文件夹 列出所有文件
        File[] files = file.listFiles();
//        File file1 = new File("/Users/ywh/CODESRC");
//        listfile(file1,"");
//        if (file.exists()) {
//            file.delete();
//        }else {
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        File parentFile = file.getParentFile();
//        parentFile.mkdirs();//递归创建多级文件

    }
//    递归文件
    public void listfile(File file,String sp){
        File[] files = file.listFiles();
        sp+="-";
        for (File file1 : files) {
            System.out.println(sp + file1.getName());
            if (file1.isFile()){
//                System.out.println(sp + file1.getName());
            }else {
//                System.out.println();
                listfile(file1,sp);
            }
        }
    }
}
