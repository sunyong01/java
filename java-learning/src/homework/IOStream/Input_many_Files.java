package homework.IOStream;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
//输入大量图片文件，然后压缩成一个文件

public class Input_many_Files {

    public static void main(String[] args) throws IOException {
try {


//判断 要创建的压缩文件是否存在 若不存在则创建
        File zipped =new File("zipped");
        if (!zipped.canRead()){
            zipped.createNewFile();}
        Map position = new HashMap();
        Map Info =new HashMap();



//输出流
        FileOutputStream FOS =new FileOutputStream("zipped");
        int p =0;
        int count=0;

        //定位符，确定获取图片目录
        File fTemp=new File("D:\\FileTestr\\Group\\.");
//获取图片列表
        File[] fr =fTemp.listFiles();
        //遍历列表中的图片
        for (File reader:fr){

            System.out.println(reader.getName());
            System.out.println(reader.length());
            //在Map中加入 文件名，位置，大小等信息

            Info.put(reader.getName(),(int)reader.length());

            byte[] tmp=new byte[(int) reader.length()];
            int hasRead =0;

//输入流，读取图片
            FileInputStream FIS =new FileInputStream(reader);

            while ((hasRead=FIS.read(tmp))>0){

                FOS.write(tmp,0,hasRead);
                count++;
                position.put(reader.getName(),p);
                p= (int) (p+reader.length());
            }
        }

        FOS.close();

//统计信息

        System.out.println("已写总大小："+p+"bytes");
        System.out.println("已读总大小："+zipped.length()+"bytes");
        System.out.println("总文件个数："+count);



      FileOutputStream u =new FileOutputStream("2.jpg");
      FileInputStream r = new FileInputStream("zipped");

int size= (int) Info.get("2.jpg");
int start= (int) position.get("2.jpg");
System.out.println(size);
System.out.println(start);
byte[] f =new byte[(int) zipped.length()];
r.read(f);
System.out.println(f.length);

    u.write(f,start,size);
    System.out.println();
}catch (IOException U){

}
    }

}
