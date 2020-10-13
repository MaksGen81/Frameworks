package com;


public class Palindrome {

    /*
    Given a string s, find the longest palindromic substring in s. If string has spaces ignore them.
    Input: "babad"
    Output: "bab"
    Note: "aba" is also a valid answer.
     */
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    public static boolean checkItPalindrome(String s) {

        for (int i = 0; i < s.length() / 2; i++) {

            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            } }
        return true;
    }

    public static String longestPalindrome(String s) {
        String result = "";
        s = s.replace(" ", "");

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (checkItPalindrome(s.substring(i, j + 1))) {  //   call upper method
                    if (s.substring(i, j + 1).length() > result.length()) {
                        result = s.substring(i, j + 1);
                    } } } }
        return result;
    }
    public static void isThePalindrome1(String str) {
        boolean check = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                check = false;
                break;
            } }

        System.out.println((check ? "Palindrome" : "Not Palindrome"));
    }
    // one more solution
    public static void isThePalindrome(String word) {
        String palindrom = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            palindrom += word.charAt(i);
        }
        if (word.equals(palindrom)) {
            System.out.println(palindrom + "  -  It is Palindrome");
        } else {
            System.out.println(palindrom + "  -  Thees word NOT Palindrome");
        }
    }
    // one more solution with number
    public static boolean numberIsPalindrome(long num){
        long remain=num;
        long rev =0;
        while (remain!=0){
            long digit = remain%10;
            rev=rev*10+digit;
            remain/=10;
        }
        return num == rev;
    }

}