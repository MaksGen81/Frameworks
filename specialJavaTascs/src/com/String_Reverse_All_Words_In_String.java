package com;


public class String_Reverse_All_Words_In_String {
    public static void main(String[] args) {

        String str = "Hello world";

        String words[] = str.split(" ");
        String reverseWord = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord += sb.toString() + " ";
        }
        System.out.println(reverseWord);

    }

    public static String mirrorWords(String text) {
        String output = "";
        String[] temp = text.split(" ");
        for (int i = 0; i < temp.length; i++) {
            output += new StringBuilder(temp[i]).reverse().toString() + " ";
        }
        return output.trim();
    }
}