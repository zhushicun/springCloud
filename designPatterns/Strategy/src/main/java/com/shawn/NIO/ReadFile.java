package com.shawn.NIO;



import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadFile {
    public static void main(String[] args) throws  Exception{
        File file = new File("E:/DIS.TXT");
        FileInputStream fis = new FileInputStream(file);
        FileChannel fisChannel = fis.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate((int) file.length());
        fisChannel.read(byteBuffer);
        System.out.println(new java.lang.String(byteBuffer.array()));
        fis.close();

    }
}
