package com.zhaochenxu.cn.day03;

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

        for (int x = 0; x <=100 ; x++) {

            for (int y = 0; y <=100 ; y++) {
                System.out.print("*");
            }

            System.out.println();
        }


        for (int o = 1; o <6; o++) {
            for (int oo = 1; oo < 6-o; oo++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }


    }
}
