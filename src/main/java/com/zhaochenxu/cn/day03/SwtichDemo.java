package com.zhaochenxu.cn.day03;

public class SwtichDemo {


    public static void main(String[] args) {

        int weekday = 6;

        switch (weekday){
            case 1:
                System.out.println("星期1");
                break;
            case 2:
                System.out.println("星期2");
                break;
            case 3:
                System.out.println("星期3");
                break;
            case 4:
                System.out.println("星期4");
                break;
            case 5:
                System.out.println("星期5");
                break;
            case 6:
                System.out.println("星期6");
               break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入的日期有误！");
                break;

        }
    }
}
