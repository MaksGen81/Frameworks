package com;


public class Word_Palindrome_True_or_False {
    public static void main(String[] args) {

        System.out.println(isPalindrome("kayak"));  //  Tasc : Is it word Palendrome
        System.out.println(isPalindrome2("hannah"));//   true or false
        System.out.println(isPalindrome2("Maxim"));
        System.out.println(isPalindrome2("was it a car or a cat i saw"));
    }                                                     //   //  w a s i t a c a r o r a c a t i s a w  -  true
    public static boolean isPalindrome(String target) {
        String reversed = "";
        target = target.replaceAll(" ","");
        for(int i = target.length()-1;i>=0;i--){          //   Output:  k a y a k
            System.out.print(target.charAt(i)+" ");       //            true
            reversed+=target.charAt(i)+"";
        }
        return reversed.equals(target);
    }                                                    //   Easier wai
    public static boolean isPalindrome2(String target) {
        String reversed = reverseString(target);
        target=target.replaceAll(" ","");
        reversed = reversed.replaceAll(" ",""); //   Output:  k a y a k  true
        return reversed.equals(target);                      //             h a n n a h  true
    }                                                        //             m i x a M   false
    public static String reverseString(String target) {
        String reversed = "";
        target = target.replaceAll(" ", "");
        for (int i = target.length() - 1; i >= 0; i--) {
            System.out.print(target.charAt(i) + " ");
            reversed += target.charAt(i) + "";
        }
        return reversed;
    }
    public static void isPalindrome( int num ) {
        int reversedNumber = 0;
        int originalNumber = num; // coz num dikrizing<but we nid to compare
        while (num > 0) {
            int last_digit = num % 10;  //  1234%10=4 ; 123%10=3
            reversedNumber = reversedNumber * 10 + last_digit; // 0+4 : 4*10=40+3=43;
            num = num / 10; //  1234/10=123 ; 123/10=12 ; 12/10=1
        } }}