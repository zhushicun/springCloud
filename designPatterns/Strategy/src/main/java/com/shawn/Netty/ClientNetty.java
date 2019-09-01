package com.shawn.Netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;

public class ClientNetty {
    public static void main(String[] args) throws Exception{
        //创建一个线程组
        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();
        //创建客户端配置项
        Bootstrap bootstrap= new Bootstrap();
        bootstrap.group(eventLoopGroup)//设置线程组
                .channel(SocketChannel.class)//设置通道实现类
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
                        socketChannel.pipeline().addLast(new ServerHandler());//添加自定义的handler
                    }
                });
        System.out.println("客户端准备完毕");
        ChannelFuture channelFuture = bootstrap.connect("127.0.0.1", 9999).sync();
        System.out.println("客户端happy完毕");
        channelFuture.channel().closeFuture().sync();
        eventLoopGroup.shutdownGracefully();

    }
}
