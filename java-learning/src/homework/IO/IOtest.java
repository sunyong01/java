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
            //将以上的int换成byte会产生  Error:java: 不兼容的类型: 从int转换到byte可能会有损失  的错误
            while ((has = i.read(cbug)) !=-1) {
                o.write(cbug);
            }

        }
        catch (IOException EX){
            EX.printStackTrace();
        }

    }


}