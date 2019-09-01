package com.shawn.NIO;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class NioClient {
    public static void main(String[] args) throws Exception{
        //获取通道
        SocketChannel channel = SocketChannel.open();
        //设置为非阻塞IO
        channel.configureBlocking(false);
        //获取服务器地址
        InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1",9999);
        //连接服务器端
        if(!channel.connect(inetSocketAddress)){
            while (!channel.finishConnect()){
                System.out.println("~~~~~~~~~------连接中-------~~~~~~做其他事情");
            }
        }

        //得到一个数据缓冲区
        String msg ="hello,晚上好";
        ByteBuffer byteBuffer = ByteBuffer.wrap(msg.getBytes());
        //发送数据
        channel.write(byteBuffer);
        System.in.read();//防止线程跑完后，channl关闭，导致服务器端报错

    }
}
