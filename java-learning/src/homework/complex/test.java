package homework.complex;

import java.util.Scanner;
//创建一个base类型为复数
class base{
    double x;
    double y;
    base(double x,double y){
        this.x=x;
        this.y=y;
    }
}
//方法的集合
class complex{
    //输入 创建复数对象
    base complexInput(){ Scanner raw =new Scanner(System.in);
        double raw_x=raw.nextDouble();
        String raw_y=raw.nextLine();
        double y=Double.parseDouble(raw_y.replace("i",""));
        return new base(raw_x,y);
    }
    //加
    base add(base b1,base b2){
        return new base(b1.x+b2.x,b1.y+b2.y);
    }
    //减
    base sub(base b1,base b2){
        return new base(b1.x-b2.x,b1.y-b2.y);
    }
    //乘
    base multiply(base b1,base b2){
        /*
           a=b1.x  b=b1.y   c=b2.x  d=b2.y
         z1=a+bi，z2=c+di
         (ac－bd)+(bc+ad)i

         */
        return new base((b1.x*b2.x)-(b1.y*b2.y),(b1.y*b2.x)+(b1.x*b2.y));
    }
    //除
    base division(base b1,base b2){
        /*
         *      a=b1.x  b=b1.y   c=b2.x  d=b2.y
         *   (a+bi)/(c+di)=(ac+bd)/(c^2+d^2) +((bc-ad)/(c^2+d^2))i
         */
         return new base((b1.x*b2.x+b1.y*b2.y)/(b2.x*b2.x+b2.y*b2.y),(b1.y*b2.x-b1.x*b2.y)/(b2.x*b2.x+b2.y*b2.y));
    }

    //调用来print一个复数对象
    void print(base bs){
        System.out.println(bs.x+"+"+bs.y+"i");
    }
}
class run{
    public static void main(String[] args) {
        System.out.println("请输入两个复数 复数中间空格为界如a+bi输入a bi，若为实数输入a 0i");
        base complex1 = new complex().complexInput();
        new complex().print(complex1);
        base complex2 = new complex().complexInput();
        new complex().print(complex2);
        System.out.println("add");
        new complex().print(new complex().add(complex1,complex2));
        System.out.println("sub");
        new complex().print(new complex().sub(complex1,complex2));
        System.out.println("multiply");
        new complex().print(new complex().multiply(complex1,complex2));
        System.out.println("division");
        new complex().print(new complex().division(complex1,complex2));
    }
}