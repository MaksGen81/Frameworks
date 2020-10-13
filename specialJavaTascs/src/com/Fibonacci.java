package com;


public class Fibonacci {

    public static void main(String[] args){

        Fibonacci(10);

    }

    public static void FindLastNumberInFibonacci(int x){

        int  y = 0, z = 1, sum=0,last=0;
        System.out.print("Upto " + x + ": ");
        while (y <= x)
        {
            System.out.print(y );
            last= y;
            sum = y + z;
            y = z;
            z = sum;
            if(y <= x){
                System.out.print(" + ");}
        }
        System.out.println("\n last element :: "+last);
    }


    public static void fibonacci(int x) {
        int y = 0, z = 1, sum = 0;
        System.out.println("Count by: " + x);
        while (y <= x) {
            System.out.print(y);
            sum = y + z;
            y = z;
            z = sum;
            if (y <= x) {
                System.out.print(" + ");
            }   }   }

    public static void Fibonacci(int num) {
        int a = 0,b = 1,next=0;
        System.out.print(a + " " + b);
        for(int i=2; i < num; i++) {
            next = a + b;
            a = b;
            b = next;
            System.out.print(" " + next);

        } }
    public static int fibonacci11(int n) {  //  recurcive

        if (n == 0) return 0;
        else if (n == 1) return 1;
        return fibonacci11(n - 1) + fibonacci11(n - 2);

    }
}
