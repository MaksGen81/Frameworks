package com;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array_2D {

    public static void main(String[] args)  {

        int [][] arr = {{4,5,6},{7,8,9, 45}};
//        System.out.println(Arrays.deepToString(arr));
//        System.out.println(Arrays.deepToString(print2D_Reverse_Array(arr)));
        int[][] a = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int [][] arr1 = {{4,5,6},{7,8,9, 45},{1,2},{34,23}};
//          System.out.println(Arrays.deepToString(arr1));
//        reverse_2D_Array(arr1);
//        fillArrayWithScanner();
        reversAllDigitsIn2D_Array(arr1);
//        reverseEach_1D_ArrayIn2DButNotAll(arr1);
    }

    public static void reversAllDigitsIn2D_Array(int[][] arr){

        int rows = arr.length-1;
        int cols = arr[0].length-1;
        int reverse[][]=new int[rows+1][cols+1];
        for(int i = rows; i >= 0; i--) {
            for(int j = cols; j >= 0; j--) {
                reverse[rows-i][cols-j] = arr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(reverse));
    }

    public static void reverseEach_1D_ArrayIn2DButNotAll(int[][] arr){

        int[][] reverse = new int[arr.length][];
        int  index;
        for (int i=0; i < arr.length; i++) {

            reverse[i] = new int[arr[i].length];

            index = 0;
            for (int j=arr[i].length-1;j>=0 ;j--){
                reverse[i][index]=arr[i][j];
                index++;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(reverse));
    }

    public static void fillArrayWithScanner(){
        int my_rows, my_cols;
        int[][] my_array;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        my_rows = input.nextInt();
        System.out.print("Enter number of columns:");
        my_cols = input.nextInt();
        my_array= new int[my_rows][my_cols];
        System.out.println("Enter elements of Array");
        for (int i = 0; i < my_rows; i++) {
            System.out.println("row");
            for (int j = 0; j < my_cols; j++) {
                my_array[i][j] = input.nextInt();
            }

        }
        System.out.println("Array is: ");
        System.out.println(Arrays.deepToString(my_array));
//        for (int i = 0; i < my_rows; i++) {
//            for (int j = 0; j < my_cols; j++) {           //  you can yse it if you want to print just digits
//                System.out.print(my_array[i][j]+" ");
//            }
//        }
    }

    public static void reverse_2D_Array(int[][] arr){
        int[][] newArr = new int[arr.length][];
        int z=0;
        for (int i= arr.length-1;i>=0;i--){
            newArr[z]=arr[i];
            z++;
        }
        System.out.println(Arrays.deepToString(newArr));
    }

    public static int[][] print2D_Reverse_Array(int arr[][]) {

        int[][] arrReversed = arr;
        for (int i=0;i< arr.length;i++){    //   this works only with 2 array;
            int[] temp = arr[i];
            arrReversed[i]=arr[arr.length-1];
            arr[arr.length-1]=temp;
        }
        return arrReversed;
    }
}