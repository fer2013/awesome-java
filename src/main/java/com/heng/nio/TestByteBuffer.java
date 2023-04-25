package com.heng.nio;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 测试ByteBuffer
 *
 * @author heng
 * @date 2023年04月22日
 */
@Slf4j
public class TestByteBuffer {

    public static void main(String[] args) {
        log.info("---------------开始-----------------");


        try (FileChannel channel = new FileInputStream("info.txt").getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(10);
            int len = 0;
            while (true) {
                len = channel.read(buffer);
                log.info("当前读到的字节数长度：len={}", len);
                while (len == -1) {
                    return;
                }
                String strContent = "";
                try {
                    strContent = new String(buffer.array(), "utf-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                log.info("当前读到的字节数长度：strContent={}", strContent);

//                buffer.flip();
                System.out.println("");
                buffer.clear();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        log.info("---------------结束-----------------");

    }
}
