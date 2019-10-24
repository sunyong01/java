package homework.IO;

import java.io.*;

public class IOtest {
    public static void main(String[] args) throws IOException {
     File u =new File("src/homework/IO/1.BMP");
        System.out.println(u.getAbsolutePath());
     File r =new File(u.getAbsolutePath().replace("1.BMP","2.BMP"));




        try (FileInputStream i = new FileInputStream(u);
        FileOutputStream o = new FileOutputStream(r);
        ) {


            byte[] cbug = new byte[(int)u.length()];
           int has = 0;
        /** 将以上的int换成byte会产生  Error:java: 不兼容的类型: 从int转换到byte可能会有损失  的错误
         * 将以下语句改成
         * while ((has = (byte) i.read(cbug)) !=-1)
         * 强制转换类型
         * 可以通过编译，且对我当前选择的图片的拷贝进程没有影响
         *
         *  将以上的int换成char会产生  Error:java: 不兼容的类型: 从int转换到char可能会有损失  的错误
         *  强制转换成char
         *  while ((has = (char) i.read(cbug)) !=-1)
         *  程序可以运行 但异常缓慢，过了很久，发现目录下出现的2.bmp高达53G且还在增长（1.BMP大小1056KB），于是结束进程
         *  该2.bmp无法打开
         *
         *  一般人肯定不会这么写代码
         *

             */
            while ((has =  i.read(cbug)) !=-1) {
                o.write(cbug);
            }

        }
        catch (IOException EX){
            EX.printStackTrace();
        }

    }


}