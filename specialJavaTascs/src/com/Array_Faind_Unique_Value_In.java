package com;


public class Array_Faind_Unique_Value_In {

    public static void main (String[] args){

        int[] arr = new int[]{1,2,3,4,3,2,5,1}; // Task:  Find a number in an array that does not repeat.

        for(int j:arr){
            int count=0;
            for(int x:arr){                     //   for each
                if(x==j){
                    count++;  } }
            if(count<2){ System.out.print(j+", "); }  // Output ; 4, 5
        }
        System.out.println("========================");

        int[] arr1 = { 1, 1, 2, 2 , 3, 4, 5, 1 , -1 };   //   for loop
        for(int j=0; j < arr.length; j++) {
            int count = 0 ;                     // to find out how many time a value is appeared in the array
            for(int i=0; i < arr.length; i++) {
                if( arr[i] == arr[j] ) {         // compares each index of the array with the given value
                    count++;          // everytime if the value is occured in the array, count will be increased by one
                } }
            if( count == 1 ) {                   // if only appeared once, we will print that value out
                System.out.println( arr[j] );
            } }
        System.out.println("========================");

        String[] arr2 = { "A", "A", "A" , "A", "B", "C", "C", "d", "c"};
        for(int j = 0; j < arr2.length; j++) {
            int count2 = 0 ;
            for(int i=0; i < arr2.length; i++) {
                if( arr2[i].equals( arr2[j] )  ) {
                    count2++;
                } }
            if(count2 == 1) {
                System.out.println( arr2[j] );}}
        System.out.println("========================");

        String str = "AAASDDDDGLLLL";
        String result = "";  // to store unique characters
        for(int j=0; j < str.length(); j++)	{
            int count3 = 0 ;  // to count number of appearances
            for(int i=0; i < str.length(); i++) {
                if( str.charAt(i) == str.charAt(j)) {
                    count3++;
                }}
            if( count3 == 1 ) {
                result+= ""+str.charAt(j);
            } }
        System.out.println(result);
    } }