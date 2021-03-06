package cn.xingoo.learn.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 正确的关闭流
 */
public class CloseStream {
    public static void main(String[] args) {
        // 字节输入流操作
        InputStream input = null;
        try {
            input = new ByteArrayInputStream("abcd".getBytes());
            int data = input.read();
            while (data != -1) {
                System.out.println((char) data);
                // todo
                data = input.read();
            }
        }catch(Exception e){
            // todo
        }finally {
            if(input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // try-with-reasource语法
        // http://tutorials.jenkov.com/java-exception-handling/try-with-resources.html

        try(InputStream input1 = new ByteArrayInputStream("abcd".getBytes())){
            //

        }catch (Exception e){
            //
        }

    }
}
