package org.example.javaio.filecls;

import org.example.javaio.buffercls.BufferRWCls;
import org.example.javaio.buffercls.BufferStreamCls;
import org.example.javaio.datacls.DataStreamCls;
import org.example.javaio.datacls.ObjStreamCls;
import org.example.javaio.printcls.PrintSW;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName FileApp.java
 * @Description TODO
 * @createTime 2021年02月21日 08:41:00
 */
public class FileApp {
    static FileCls fileCls = new FileCls();

    static StreamCls streamCls = new StreamCls();
    static ReadWriterCls readWriterCls = new ReadWriterCls();
    static BufferStreamCls bufferStreamCls = new BufferStreamCls();
    static BufferRWCls bufferRWCls = new BufferRWCls();
    static DataStreamCls dataStreamCls = new DataStreamCls();
    static ObjStreamCls objStreamCls = new ObjStreamCls();
    static PrintSW printSW = new PrintSW();
    public static void main(String[] args) {
//        fileCls.test01();
//        streamCls.test01();
//        streamCls.test02();
//        readWriterCls.test01();
//        bufferStreamCls.test01();
//        bufferRWCls.test01();
//        dataStreamCls.test01();
//        objStreamCls.test01();
//        printSW.test01();
        printSW.test02();

    }
}
