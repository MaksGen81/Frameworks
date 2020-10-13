package com;


public class Check_Check_Check {

    public static void main(String[] args) {



    }
    /*
    Notebook:
    Create a method that divides A by B,
    For example input is: 13 / 5
    gives output: “Result is 2 and remainder is 3”
    You can’t use “*” and “/“ operators.
    public static void divider(final int a, final int b) {
          //Your code goes here
    }
     */
    public static void divider(final int a, final int b) {
        int num1 = a;
        int count = 0;
        while(num1>b){
            num1 = num1-b;
            count++;
        }
        System.out.println("Result is " + count +" and remainder is " + num1);
    }
}