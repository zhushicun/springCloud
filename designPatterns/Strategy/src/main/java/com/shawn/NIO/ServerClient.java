package com.shawn.NIO;

import org.apache.ibatis.annotations.SelectKey;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;

public class ServerClient {

    public static void main(String[] args) throws  Exception{

        //得到serverSocketChannel,老大
        ServerSocketChannel serverSocketChannel  = ServerSocketChannel.open();
        //得到
        Selector selector = Selector.open();
        //绑定一个端口
        serverSocketChannel.bind(new InetSocketAddress(9999));
        //设置非阻塞方式
        serverSocketChannel.configureBlocking(false);
        //将老大注册到间谍里面
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        while (true){
            if(selector.select()==0){
                System.out.println("我在干其他事情");
                continue;
            }

            Iterator<SelectionKey> selectionKeyIterator = selector.selectedKeys().iterator();
            while (selectionKeyIterator.hasNext()){
                SelectionKey selectionKey = selectionKeyIterator.next();
                if(selectionKey.isAcceptable()){
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    socketChannel.configureBlocking(false);
                    socketChannel.register(selector,SelectionKey.OP_READ, ByteBuffer.allocate(1024));
                }

                if(selectionKey.isConnectable()){

                }

                if(selectionKey.isReadable()){
                    SocketChannel channel = (SocketChannel) selectionKey.channel();
                    ByteBuffer byteBuffer= (ByteBuffer) selectionKey.attachment();
                    channel.read(byteBuffer);
                    System.out.println(new String(byteBuffer.array()));
                }

                if(selectionKey.isValid()){

                }

                if(selectionKey.isWritable()){

                }
                selectionKeyIterator.remove();
            }
        }
    }
}
