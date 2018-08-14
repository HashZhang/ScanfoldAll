package com.github.hashJang.scanfold.netty.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

import java.util.concurrent.atomic.AtomicInteger;

public class EchoServerHandler extends ChannelInboundHandlerAdapter {
    private AtomicInteger count = new AtomicInteger(0);
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf in = (ByteBuf) msg;
        ByteBuf out = ctx.alloc().buffer(1024);
        StringBuilder stringBuilder = new StringBuilder();
        while (in.isReadable()) {
            stringBuilder.append(in.readByte());
        }
        try {
            ctx.fireChannelRead();
        } finally {
            System.out.println("EchoServerHandler: " + count.incrementAndGet());
            ReferenceCountUtil.release(msg);
        }
        ctx.fireChannelRead(msg);
    }
}
