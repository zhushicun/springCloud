package com.shawn.Netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;

import java.awt.*;

public class ServerNetty {
    public static void main(String[] args) throws Exception {
        //创建一个线程组，接收客户端连接
        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();
        //创建一个线程组，处理业务操作
        EventLoopGroup eventLoopGroupService = new NioEventLoopGroup();
        //创建服务器启动助手来配置参数
        ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(eventLoopGroup,eventLoopGroupService)//加入两个线程组
                .option(ChannelOption.SO_BACKLOG,128)//设置等待的连接个数
                .childOption(ChannelOption.SO_KEEPALIVE,true)//设置保持活动连接状态
                .childHandler(new ChannelInitializer<SocketChannel>() {//创建一个通道初始化对象
                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
                        socketChannel.pipeline().addLast(new ServerHandler());//往pipel中添加handdler类
                    }
                });
        System.out.println("server is ready");
        ChannelFuture sync = serverBootstrap.bind(9999).sync();//异步绑定端口
        System.out.println("server is start");
        sync.channel().closeFuture().sync();
        eventLoopGroup.shutdownGracefully();
        eventLoopGroupService.shutdownGracefully();
    }
}
