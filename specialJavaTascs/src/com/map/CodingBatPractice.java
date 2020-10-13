package com.map;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CodingBatPractice {

    public static void main(String[] args) {

        String[] each = {"a", "b", "a", "c", "b"};
        System.out.println(wordMultiple(each));
        String[] each1 = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        System.out.println(Arrays.toString(allSwap(each1)));
    }

    public static String[] allSwap(String[] strings) {
/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return
the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings
in the array. When a position in the array has been swapped, it no longer matches anything. Using a map, this can be
solved making just one pass over the array. More difficult than it looks.
EX:
allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
 */
        Map<String, Integer> map = new HashMap();
        for (int i = 0; i < strings.length; i++){
            if (map.containsKey(strings[i].charAt(0) + "")){
                String string = strings[i];
                strings[i] = strings[map.get(strings[i].charAt(0) + "")];
                strings[map.get(strings[i].charAt(0) + "")] = string;
                map.remove(strings[i].charAt(0) + "");
            } else
                map.put(strings[i].charAt(0) + "", i);
        }
        return strings;
    }

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        /*
Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true
if that string appears 2 or more times in the array.
EX:
wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
         */
        Map<String, Boolean> map =new HashMap<>();
        for (String each:strings){
            String key = each;
            Boolean value=false;
            if(map.containsKey(key)){
                value=true;
                map.put(key,value);
            }else {
                map.put(key,value);
            }
        }
        return map;
    }
    public static Map<String, Integer> wordCount(String[] strings) {
        /*
The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each
different string, with the value the number of times that string appears in the array.
EX:
wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
         */
        Map<String ,Integer> map = new HashMap<>();
        for (String each : strings){
            int count = 0;
            for (String each2 : strings){
                if(each.equals(each2)){
                    count++;
                }
            }
            map.put(each,count);
        }
        return map;
    }

    public static Map<String, String> firstChar(String[] strings) {
        /*
Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
with the value of all the strings starting with that character appended together in the order they appear in the array.
EX:
firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
         */
        Map<String,String> map = new HashMap<>();

        for (String each : strings){
            String key = each.charAt(0)+"";

            if(map.containsKey(key)){
                String value = map.get(key)+each;
                map.put(key,value);
            }else {
                map.put(key,each);
            }
        }
        return map;
    }

    public static String wordAppend(String[] strings) {
        /*
        Loop over the given array of strings to build a result string like this: when a string appears the
        2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if
        no string appears a 2nd time.
EX:
wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"
         */

        Map<String,Integer> map= new HashMap<>();
        String str="";
        for (String each : strings){
            String key = each;
            if(map.containsKey(key)){
                int value = map.get(key);
                value++;
                if(value%2==0)
                    str+=key;
                map.put(key,value);

            }else {
                map.put(key,1);
            }
        }

        return str;
    }
}