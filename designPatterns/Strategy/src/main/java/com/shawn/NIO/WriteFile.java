package com.shawn.NIO;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class WriteFile {

    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("E://DIS.TXT");
        FileChannel channel = fileOutputStream.getChannel();
        //定义buffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        String msg = "yes,my leader";
        byteBuffer.put(msg.getBytes());
        //将指针指向第一行
        byteBuffer.flip();
        channel.write(byteBuffer);
        channel.close();

    }
}
