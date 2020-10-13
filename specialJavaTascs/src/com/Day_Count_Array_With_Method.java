package com;


public class Day_Count_Array_With_Method {

    public static void main(String[] args){



        System.out.println(day(3));
        System.out.println(day(6));
        System.out.println(day(9));


    }
    public static String day(int num){
        String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        if (num > 7 || num < 0) {
            return "Fun Day";
        }
        else{
            return week[num-1];
        }
    }}
