package com.company;

public class 循环 {
    public static void main(String[] args) {
        for (int i=99;i>0;i--)
        {
            if (i>=2){
            System.out.println(i +"bottles of beer on the wall," +i +"bottles of beer,");
            System.out.println("Take one down");
            System.out.println("Pass it around.");
        }else {
                System.out.println(i +"bottle of beer on the wall," +i +"bottle of beer,");
                System.out.println("Take one down");
                System.out.println("Pass it around.");
                System.out.println(i-1+"bottle of beer on the wall.");
            }
        }
    }
}
