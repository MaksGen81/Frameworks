package com;


import java.util.Arrays;
import java.util.List;

public class Finde_Longest_Word_In_Sentence {

    public static void main(String[] args) {
/*
String str = "All lanes are currently closed. There was accident. Commuters' should avoid the area. ";
write a code find me longest word in this String, and print the word and the size of it
 */
        String str = "All lanes are currently closed. There was accident. Commuters' should avoid the area.";
        String[] strArr = str.split("[\\s.']");
        String longestWord = strArr[0];
        for (String currentWord : strArr) {
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            } }
        System.out.println(longestWord);
        System.out.println("=========================");

        String str2 = "All lanes are currently closed. There was accident. Commuters' should avoid the area. ";
        String word = "";
        String[] strArr2 = str2.split(" ");
        for(String each : strArr2){
            if(each.length()>word.length()){
                word=each;
            } }
        String[] newWord =word.split("") ;
        for (String each : newWord){
            if(each.contains("'")){
                continue;
            }
            System.out.print(each);
        }
        System.out.println("\n=========================");
        String str3 = "All lanes are currently closed. There was accident. Commuters' should avoid the area. ";
        String word1 = "";
        List<String> words = Arrays.asList(str3.replace(".","").replace("'","").split(" "));
        for(String each : words){
            if(each.length()>word1.length()){
                word1=each;
            } }
        System.out.println(word1);
        System.out.println("\n=========================");

        String[]  names = {"AAA","SS","WWWW","QQQQQQ"};
        String LongestName ="";
        int max = 0;
        for(int i=0; i < names.length; i++) {
            if(names[i].length() > max) {
                max = names[i].length();
                LongestName = names[i];
            } }
        System.out.println(max);
        System.out.println(LongestName);
    }}