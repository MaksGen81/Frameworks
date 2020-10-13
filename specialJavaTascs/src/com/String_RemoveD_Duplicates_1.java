package com;

public class String_RemoveD_Duplicates_1 {
    public static void main(String[] args) {


        System.out.println(remuveDup("AADDDKKK"));
        System.out.println(count("abcdaaa","a"));
        System.out.println(friquency("aaaavvvmmm"));

    }
    public static String remuveDup(String str){

        String result ="";
        for(int i=0; i<str.length();i++){
            if(!result.contains(str.substring(i,i+1))){
                result+=str.substring(i,i+1);
            } }
        return result;
    }
    public static int count(String a, String b){
        int count=0;
        while(a.contains(b)){
            count++;
            a = a.replaceFirst(b,"");  // asain "a"
        }
        return count;
    }
    public static String friquency (String str){
        String nonDup = remuveDup(str);
        String result = "";
        for(int i=0;i<nonDup.length();i++) {
            int count = count(str,""+ nonDup.charAt(i));
            result += ""+ nonDup.charAt(i) + count;
        }
        return  result;
    }

}