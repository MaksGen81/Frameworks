package com;

public class Armstrong_Number {
    /*
    Create a method that will accept a number and check if the number is an Armstrong number.
    If the number is an Armstrong number return true otherwise return false.
     */
    public static void main(String[] args) {
        int num = 153;
        int n = 235;
        System.out.println(itIsArmstrongNumber(num));
        System.out.println(itIsArmstrongNumber2(n));
    }

    public static boolean itIsArmstrongNumber(int num) {
        String number = String.valueOf(num);
        int power = number.length();
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = Integer.parseInt("" + number.charAt(i));
            sum += Math.pow(digit, power);
        }
        return num == sum;
    }

    // one more solution
    public static boolean itIsArmstrongNumber2(int num) {
        int digit = num, sum = 0;
        int power = String.valueOf(num).length();
        while (digit != 0) {
            int each = digit % 10;
            digit /= 10;
            sum += Math.pow(each, power);
        }
        return sum == num;
    }
}