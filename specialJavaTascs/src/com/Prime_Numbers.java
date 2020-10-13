package com;


public class Prime_Numbers {
    /*
    Create a method that will accept a number and print all the prime number from 2 to that given number
     */
    public static void main(String[] args) {
        int num = 100;
        printAllPrimeNumbers(num);
    }

    public static void printAllPrimeNumbers(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}