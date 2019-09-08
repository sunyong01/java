package com.company;
//求积分：很多个等边梯形的面积和
//长江大学 大数据11801 SY
//以下是求一定精度范围内 f(x)=2x²+3的定积分
public class Main {

    private static double fx(double x)
    {
        return 2*x*x+3;
    }

    public static void main(String[] args) {
        double a=0,b=1;
        double c=b-a,n=1000000000;
        double r=c/n;
        double s=0;
        while (a<b) {
            s=s+(fx(a)+fx(a+r))*r/2;
            a=a+r;
        }
        System.out.println(s);
    }
}
