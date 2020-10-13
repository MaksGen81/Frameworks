package com;


import java.util.*;

public class String_RemoveD_Duplicates {
    public static void main(String[] args) {

        //  System.out.println(removeDupValues("AAABCCCDDEFFSGTTJB"));
        CountCharFrequencyAndStoreItInMap("AAABCCCDDEFFSGTTJB");
    }
    public static String removeDupValues(String str) {
        String [] arr = str.split("");
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set);
        return set.toString().replace("[","").replace("]","").replace(", ","");
    }

    public static void CountCharFrequencyAndStoreItInMap(String str){
        Map<Character,Integer> charFreq = new HashMap<>();
        for(int x= 0;x<str.length();x++){
            if(!charFreq.containsKey(str.charAt(x))){
                System.out.println("Enter for the first time  " + str.charAt(x));
                charFreq.put(str.charAt(x),1);
            }else {
                charFreq.replace(str.charAt(x),charFreq.get(str.charAt(x))+1);
            } }
        System.out.println("charFreq = " + charFreq);
    }

    public static void RemoveDuplicatesAndCompareTwoString(String a, String b){
        String a1 = "" ;
        for(int j= 0; j < a.length(); j++) {
            if(!a1.contains( a.substring(j, j+1)  )  ) {
                a1 += a.substring(j, j+1) ;
            } }
        System.out.println(a1);     // a1 ="abc"

        String b1 = "";
        for(int i=0; i < b.length(); i++ ) {           //   one loop remove duplicates
            if(! b1.contains( ""+b.charAt(i) )) {
                b1 += ""+b.charAt(i);
            } }
        System.out.println(b1);  //      b1 ="cab"

        char[] ch1 = a1.toCharArray();  // String -->char[]
        char[] ch2 =b1.toCharArray();
        Arrays.sort(ch1);   //  sort
        Arrays.sort(ch2);

        String str1 = Arrays.toString(ch1);   //  char[] -->String
        String str2 = Arrays.toString(ch2);

        if(str1.equals(str2)) {
            System.out.println("True, they are build out of same letetrs");
        } else {
            System.out.println("False, different letters");
        }
    }
    public static void RemoveDuplicatesAndCompareTwoString1(String Str1, String Str2){   // String -> TreeSet
        Str1 = new TreeSet<String>( Arrays.asList( Str1.split(""))).toString();
        Str2 = new TreeSet<String>( Arrays.asList( Str2.split(""))).toString();
        System.out.println(Str1.equals(Str2));
    }
    public static void RemoveDuplicatesAndCount(String str){  // Substring
        String RemoveDup = "";
        for(int i=0; i < str.length(); i++) {
            if( ! RemoveDup.contains( str.substring(i, i+1)) ) {
                RemoveDup += str.substring(i, i+1);
            } }
        System.out.println(RemoveDup);
        String result ="";
        for(int j=0; j < RemoveDup.length(); j++) {
            int count =0;
            for(int i=0; i < str.length(); i++) {
                if( str.substring(i, i+1).equals( RemoveDup.substring(j, j+1)) ) {
                    count++;
                } }
            result += RemoveDup.substring(j, j+1) + count;
        }
        System.out.println(result);
    }
    public static void RemoveDuplicatesAndCount1(String str3){  // CharAt
        String expectedResult = "";
        for(int j=0; j < str3.length(); j++) {
            int count = 0;
            for(int i=0; i < str3.length(); i++) {
                if(str3.charAt(i) == str3.charAt(j)) {
                    count++;
                } }
            expectedResult += ""+str3.charAt(j) + count;
            str3 = str3.replace(""+str3.charAt(j) ,  "" );
        }
        System.out.println(expectedResult);
    }
    //  Next Three methods chaining each other
    public static String remuveDuplicate(String str){  //  TASK:  RemoveDuplicate("aaabbbccc") ==> "abc"
        String result1="";
        for(int i=0;i<str.length();i++){
            if(!result1.contains(""+str.charAt(i))) {
                result1+= str.charAt(i); } }
        return result1;
    }
    public static void friquencyOfCharacters(String str) {  // TASK:  FrequencyOfChars("CCAAABBBCCCC")  ==>"A3B3C6"
        String nonDup = remuveDuplicate(str);
        for(int i=0;i<nonDup.length();i++){
            int count =frequency(str,nonDup.charAt(i));
            System.out.print(""+nonDup.charAt(i)+count+" ");   }
    }
    public static int frequency(String str, char ch){  // TASK:  Frequency("AAABBB", 'A') ==> 3
        int count = 0;
        char[] arr = str.toCharArray();
        for(char each : arr){
            if(each == ch){
                count++;
            } } return count;
    }
}