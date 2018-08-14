package com.github.hashZhang.scanfold.jdk.file;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.TimeUnit;

public class FileMmapTest2 {
    public static void main(String[] args) throws Exception {
        RandomAccessFile randomAccessFile = new RandomAccessFile("./FileMmapTest.txt", "rw");
        FileChannel channel = randomAccessFile.getChannel();
        MappedByteBuffer []mappedByteBuffers = new MappedByteBuffer[5];

        mappedByteBuffers[0] = channel.map(FileChannel.MapMode.READ_WRITE, 0, 2 * 1024 * 1024 * 1024 - 1);
        mappedByteBuffers[1] = channel.map(FileChannel.MapMode.READ_WRITE, 0, 2 * 1024 * 1024 * 1024 - 1);
        mappedByteBuffers[2] = channel.map(FileChannel.MapMode.READ_WRITE, 0, 2 * 1024 * 1024 * 1024 - 1);
        mappedByteBuffers[3] = channel.map(FileChannel.MapMode.READ_WRITE, 0, 2 * 1024 * 1024 * 1024 - 1);
        mappedByteBuffers[4] = channel.map(FileChannel.MapMode.READ_WRITE, 0, 2 * 1024 * 1024 * 1024 - 1);


        for (int j = 0; j < 2*1024*1024*1024 - 1; j++) {
            mappedByteBuffers[0].put("a".getBytes());
        }
        TimeUnit.SECONDS.sleep(1);
        byte []to = new byte[1];

        for (int j = 0; j < 2*1024*1024*1024 - 1; j++) {
            mappedByteBuffers[1].get(to);
            mappedByteBuffers[2].get(to);
            mappedByteBuffers[3].get(to);
            mappedByteBuffers[4].get(to);
        }

        while(true) {
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
