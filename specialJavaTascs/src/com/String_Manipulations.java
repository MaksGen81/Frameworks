package com;


public class String_Manipulations {

    public static void main(String[] args) {

        System.out.println(endOther("Hiabc", "abc"));
        System.out.println(endOther("AbC", "HiaBc"));
        System.out.println(endOther("abcXYZ", "abcDEF"));
    }

    public static int countYZ(String str) {
        /*
        Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez"
        count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if
        there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char
        is an alphabetic letter.)
        EX:
        countYZ("fez day") → 2
        countYZ("day fez") → 2
        countYZ("day fyyyz") → 2
         */
        int count = 0;
        int length = str.length();
        str = str.toLowerCase();

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {
                if (i < length - 1 && !Character.isLetter(str.charAt(i + 1))) {
                    count++;
                } else if (i == length - 1) {
                    count++;
                }

            }
        }

        return count;
    }

    public static boolean endOther(String a, String b) {
// Given two strings, return true if either of the strings appears at the very end of the other string,
// ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
// Note: str.toLowerCase() returns the lowercase version of a string.
        a=a.toLowerCase();
        b=b.toLowerCase();

        if(a.length()<b.length()){
            String temp = b.substring(b.length()-a.length());
            return temp.equals(a);
        }else {
            String temp = a.substring(a.length()-b.length());
            return temp.equals(b);
        }

    }

    public int countCode(String str) {
//Return the number of times that the string "code" appears anywhere in the given string, except we'll
// accept any letter for the 'd', so "cope" and "cooe" count.
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            String word = str.substring(i, i + 4);
            if (word.startsWith("co") && word.endsWith("e")) {
                count++;
            }
        }
        return count;
    }

    public static boolean catDog(String str) {

        //Return true if the string "cat" and "dog" appear the same number of times in the given string.
        int cat = 0, dog = 0;

        for (int i = 0; i < str.length()-2; i++) {
            String word = str.substring(i,i+3);
            if (word.compareTo("cat")==0) {
                cat++;
            } else if (word.compareTo("dog")==0) {
                dog++;
            }
        }
        return cat==dog;
    }

    public static int countHi(String str) {

        // Return the number of times that the string "hi" appears anywhere in the given string.

        int count = 0;
        str = str.toLowerCase();
        while(str.contains("hi")){
            count ++;
            str = str.replaceFirst("hi","");
        }
        return count;
    }
    public static int countHi2(String str) {

        // Return the number of times that the string "hi" appears anywhere in the given string.

        int count = 0;
        for (int i=0;i<str.length()-1;i++){
            String word = str.substring(i,i+2);
            if(word.compareTo("hi")==0){
                count++;
            }
        }
        return count;
    }
}