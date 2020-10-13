package com;


import java.util.Arrays;

public class Array_Fill {

    public static void main(String[] args) {

        int[] arr = {3,2,6,5,8,7,3};
        System.out.println(Arrays.toString(fizzArray(10)));
    }

    public static int[] fizzArray(int n) {


        int [] arr = new int[n] ;
        int j=0;
        for(int i=0;i<arr.length;i++){
            arr[j]=i;
            j++;

        }
        return arr;
    }
    public String[] fizzArray2(int n) {

        int x =0;

        String[] arr = new String[n];

        for(int i=0;i<arr.length;i++){

            arr[x] = String.valueOf(i);
            x++;
        }
        return arr;
    }
}