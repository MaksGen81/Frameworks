package com;


import java.util.*;

public class String_Unique_Characters {
    /*
     Create a method that will accept a String and return a version
     that has only the unique characters.
     Ex: unique("AAABCCCDDEFFS") ==> ”BES"
     */
    public static void main(String[] args) {
        System.out.println(uniqueChar("AAABCCCDDEFFSGTTJB"));

    }

    public static String uniqueChar(String str) {
        String unique = "";
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        for (String each : list) {
            int count = Collections.frequency(list, each);
            if (count == 1) unique += each;
        }
        return unique;
    }

}
