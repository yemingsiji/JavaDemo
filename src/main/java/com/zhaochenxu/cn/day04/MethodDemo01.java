package com.zhaochenxu.cn.day04;

public class MethodDemo01 {


    public static void main(String[] args) {
        MethodDemo01 md = new MethodDemo01();
        int sum1 = md.add(2000, 3);
        int sum2 = (short) md.add(2, 3);
        double sum3 = md.add(2.2, 3.2);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

    }

    public int add(int x, int y) {
        return x + y;
    }
    public int add(short x, short y){
        return (short)x+y;
    }
    public double add (double x, double y){
        return x+y;
    }
}
