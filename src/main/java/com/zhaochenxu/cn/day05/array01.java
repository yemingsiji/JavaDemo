package com.zhaochenxu.cn.day05;

public class array01 {

    public static void main(String[] args) {


        int [] arr = new int[]{1,2,3,4};
        int [] arr2 = {1,2,3,4};


//        arr = null;
        System.out.println(arr[0]);
        System.out.println(arr2[0]);
        int [] arr3 =new int[3];
        System.out.println(arr3[0]);

        char [] arr4 = new char[]{'a','b','c'};
        System.out.println(arr4[0]);

        String [] arr5 = new String[]{"zhangsan","lisi"};
        System.out.println(arr5);
        System.out.println(arr5[0]);

        for (int i = 0; i <arr2.length ; i++) {
            System.out.println(arr2[i]);

        }

    }
}
