package com.shawn.NIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class CopyFile {
    public static void main(String[] args) throws  Exception{
        FileInputStream fileInputStream = new FileInputStream("E://DIS.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("E://DISCOPY.txt");
        FileChannel fileInputStreamChannel = fileInputStream.getChannel();
        FileChannel fileOutputStreamChannel = fileOutputStream.getChannel();
        fileOutputStreamChannel.transferFrom(fileInputStreamChannel,0,fileInputStreamChannel.size());
        fileInputStreamChannel.close();
        fileOutputStreamChannel.close();;
    }
}
