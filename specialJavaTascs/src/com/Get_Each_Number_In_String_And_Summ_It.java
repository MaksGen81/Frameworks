package com;


public class Get_Each_Number_In_String_And_Summ_It {

    public static void main(String[] args) {  //  no sum if sequence

        String str = "AA3DDGH22J1H6GF41";
        getNumberFromStringAndSumm(str);
        System.out.println();
        RemuveDidgitFromString(str);
        System.out.println();
        getNumberFromStringAndSumm2(str);

    }
    public static void getNumberFromStringAndSumm(String str){  //  no sum if sequence
        String numsSequence ="";
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                numsSequence+=str.charAt(i);
                int num = Integer.valueOf(""+str.charAt(i));
                sum+=num;
            } }
        System.out.println(numsSequence);      //   3221641
        System.out.println(sum);               //   19
    }
    public static void getNumberFromStringAndSumm2(String str){
/*
Create a program that will take any String and print the total sum of all the number in the String.
Note: numbers can be more than digits from 1-9 so if you have “14” next to each other it should be
considered 14 and not 1 and 4 separate
 */
        int sum = 0;
        String num = "";
        for(int i=0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                num += str.charAt(i);
                if(i == str.length()-1 || !Character.isDigit(str.charAt(i+1))){
                    sum += Integer.parseInt(num);
                    num = "";
                } }}               //   3221641
        System.out.println(sum);   //   73

    }
    public static void RemuveDidgitFromString(String str){

        String s1 = "";
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                s1+=str.charAt(i);
                int eachNum = Integer.parseInt(str.charAt(i)+"");
                sum+=eachNum;
            } }
        System.out.print(sum+"\n");
        System.out.print(s1+" ");    //  19

    }
}