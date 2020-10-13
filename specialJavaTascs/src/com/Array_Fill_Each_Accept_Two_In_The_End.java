package com;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array_Fill_Each_Accept_Two_In_The_End {


    public static void main(String[] args) {
        List<Integer> intN = new ArrayList<>(Arrays.asList(1, 11, 111, 16));
        System.out.println(two2(intN));
        List<Integer> intNN = new ArrayList<>(Arrays.asList(3, 1, 4));
        System.out.println(two2_next(intNN));
    }

    public static List<Integer> two2(List<Integer> nums) {

        /*
Given a list of non-negative integers, return a list of those numbers multiplied by 2,
omitting any of the resulting numbers that end in 2.
         */
        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {

            nums.removeIf(n->(n*2)%10==2);
            if(nums.isEmpty())break;
            newList.add(nums.get(i)*2);
        }
        return newList;
    }
    //  next solution
    public List<Integer> two2_2(List<Integer> nums) {
        return nums = nums.stream().map(n -> n * 2).filter(n -> n % 10 != 2).collect(Collectors.toList());
    }
    /*
Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of
the resulting numbers that end in 5 or 6.
    */
    public List<Integer> square56(List<Integer> nums) {
        return nums = nums.stream().map(n -> n * n + 10).filter(n -> n % 10 != 5 && n % 10 != 6).collect(Collectors.toList());
    }

    //  next solution
    public static List<Integer> two2_next(List<Integer> nums) {

        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {

            nums.removeIf(n->(n*n+10)%10==5 && (n*n+10)%10==6);
            if(nums.isEmpty())break;
            newList.add(nums.get(i)*nums.get(i)+10);
        }
        return newList;
    }
    /*
    Given a list of strings, return a list where each string has “y” added at its end, omitting any resulting strings
    that contain “yy” as a substring anywhere.
     */
    public List<String> noYY(List<String> strings) {
        return strings.stream().map(n -> n + "y").filter(n -> !n.contains("yy")).collect(Collectors.toList());
    }
}