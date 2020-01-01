package com.zhaochenxu.cn.day05;

public class array02 {


    public static void main(String[] args) {



        int [] arr = new int[]{23,46,47,13,-1};

//        System.out.println(arr.length);
//        System.out.println(arr.clone());
//        System.out.println(arr.hashCode());

        int Max = getMax(arr);
        System.out.println(Max);





    }



    public static int getMax(int [] arr){

        int max = 0 ;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > max){

                max = arr[i];

            }

        }
        return max;
    }
}
