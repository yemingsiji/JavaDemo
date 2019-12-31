package com.zhaochenxu.cn.day03;

import java.util.Random;

public class ForDemo {


    public static void main(String[] args) {


        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");


        for (int i = 0; i < 10; i++) {

            System.out.println("hello world" +i);

        }

        for (int j = 0; j <=100; j++) {
            if (j % 2 ==0){
                continue;
            }
            System.out.print("奇数为:"+j);
        }





    }
}
