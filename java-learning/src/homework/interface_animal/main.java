package homework.interface_animal;

public class main {
    public static void main(String[] args) {

   autoanimal niao =new bird();//接口的实现
   niao.is();
   niao.move();
   niao.eat();
   niao.say();
   pig zhu = new pig();//类的继承方法
   zhu.is();
   zhu.eat();
   zhu.move();
   zhu.say();




    }
}
