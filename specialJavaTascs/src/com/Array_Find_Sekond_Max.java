package com;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
public class Array_Find_Sekond_Max {
    public static void main(String[] args) {



        int[] arr = {1,2,5,3,8,7,9,4};  //  Write a code to find the second highest number in this array
        getFirstAndSecondMax2(arr);



    }
    public static void getFirstAndSecondMax5(int[] arr2){
        int temp =0;
        for(int i=0;i<arr2.length;i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] > arr2[j]) {
                    temp=arr2[i];                           //sort array
                    arr2[i]=arr2[j];
                    arr2[j]=temp; } } }
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[arr2.length-2]);
    }

    public static void getFirstAndSecondMax4(int[] arr){
        int maximum = 0; // max =20, max = 200
        for(int i=0; i < arr.length; i++ ) {
            if(arr[i] > maximum) {
                maximum = arr[i];
            } }
        System.out.println("Maximum number is: " + maximum);
        int secondMax = 0;
        for(int j =0; j < arr.length; j++) {
            if(arr[j] > secondMax && arr[j] != maximum) {
                secondMax = arr[j];
            } }
        System.out.println("Second maximum number is: "+secondMax);
    }
    public static void getFirstAndSecondMax3(int[] nums){
        Arrays.sort( nums );
        System.out.println(Arrays.toString(nums));
        System.out.println("Minimum number: " + nums[0] );
        System.out.println("Maximum Number: "+ nums [ nums.length-1 ]);
        System.out.println("Second Maximum Number: " + nums [ nums.length-2 ]);
        System.out.println("Second Minimum Number: "+ nums[1]);
    }
    public static void getFirstAndSecondMax(Integer [] arr){

        Set<Integer> setInt = new TreeSet<>(Arrays.asList(arr));
        Integer[] newArr = setInt.toArray(new Integer[]{});
        System.out.println("First max - "+newArr[newArr.length-1]);
        System.out.println("Second max - "+newArr[newArr.length-2]);
    }
    public static void getFirstAndSecondMax2(int[] arr){
        int max=0,secondMax=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max= arr[i];
            }
        }
        System.out.println("Max - "+max+" \n"+"Second Max - "+secondMax);
    }
}