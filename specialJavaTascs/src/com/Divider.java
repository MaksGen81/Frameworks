package com;

public class Divider {

    public static void main(String[] args) {


    }

    public static void divider(final int a, final int b) {
        int num1 = a;
        int count = 0;
        while(num1>=b){
            num1 = num1-b;
            count++;
        }
        System.out.println("Result is " + count +" and remainder is " + num1);
    }

}
