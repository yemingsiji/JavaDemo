package com.zhaochenxu.cn.day04;



public class idea01 {

    public static void main(String[] args) {

        demo();


//        int sum = SUM(110,200);
//        System.out.println(sum);

        SUM(100,200);
        return;



    }

    public static void demo() {
        System.out.println("demo");

        return;
    }

    public String demo2(){

        System.out.println("demo2");

        return "yes";
    }
    public static int SUM(int num1, int num2){
        System.out.println("加法");
        System.out.println(num1+num2);
        return num1+ num2;
    }


}
