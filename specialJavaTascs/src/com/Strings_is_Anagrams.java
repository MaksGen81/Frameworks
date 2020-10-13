package com;


public class Strings_is_Anagrams {
    public static void main(String[] args) {


        String a = "listen";
        String b = "silent";
        IsAnagrams(a,b);
        IsAnagrams2(a,b);
    }

    public static void IsAnagrams(String a, String b) {
        a = a.toLowerCase().replace(" ", "");
        b = b.toLowerCase().replace(" ", "");
        if (a.length() != b.length()) {
            System.out.println("Not Anagram");
            System.exit(0);
        }
        for (int i = 0; i < a.length(); i++) {
            b = b.replaceFirst(a.charAt(i) + "", "");
        }
        if (b.isEmpty()) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }


    }
    public static void IsAnagrams2(String a, String b) {
        a = a.toLowerCase().replace(" ", "");
        b = b.toLowerCase().replace(" ", "");
        if (a.length() != b.length()) {
            System.out.println("Not Anagram");
            System.exit(0);
        }
        for (int i = 0; i < a.length(); i++) {
            b = b.replaceFirst(a.charAt(i) + "", "");
        }
        System.out.println((b.isEmpty() ? "Anagram" : "Not Anagram"));  //  Ternary


    }
}