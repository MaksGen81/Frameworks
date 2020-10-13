package com;


public class String_Characters_Count {

    /*
    Given any String print out how many times each character is found in the String
    Ex: java
    Ex:j–1  a–2  v–1
     */

    public static void main(String[] args) {

        String a = "Maximilius";
        charCount(a);
        OneMoreCharCount(a);

    }

    public static void charCount(String word) {
        String nonDup = "";
        for (int x = 0; x < word.length(); x++) {
            if (!nonDup.contains("" + word.charAt(x))) {
                nonDup += word.charAt(x);
            }
        }
        System.out.println(nonDup);
        for (int i = 0; i < nonDup.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (nonDup.charAt(i) == word.charAt(j)) {
                    count++;
                }}
            System.out.println(nonDup.charAt(i) + " - " + count);
        }   }
    // one more solution

    public static void OneMoreCharCount(String str) {

        String check = "";
        for (int i = 0; i < str.length(); i++) {
            if (check.contains(str.charAt(i) + ""))
                continue;
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            System.out.println(str.charAt(i) + " - " + count);
            check += str.charAt(i);
        }   }


}