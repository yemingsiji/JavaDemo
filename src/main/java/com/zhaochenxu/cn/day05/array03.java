package com.zhaochenxu.cn.day05;

public class array03 {

    public static void main(String[] args) {


        int [][] arr2 = {{3,1,4},{2,3,4,5,7},{10,-7},{3,0001}};


        System.out.println(arr2.length);


        int  sum = 0;
        for (int i = 0; i <arr2.length ; i++) {

            for (int j = 0; j <arr2[i].length ; j++) {
               sum+= arr2[i][j];
            }
            
        }

        System.out.println("sum="+sum);


    }
}
