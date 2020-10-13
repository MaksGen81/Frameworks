package com.collection;

import java.util.*;

public class List_Practice {

    public static void main(String[] args) {

        Integer[] arr = {12, 13, 19, 20};
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        List<String> list1 = new ArrayList<>();
        list1.add("asd");
        list1.add("azs");
        list1.add("hzello");
        list1.add("hello");
        System.out.println(noZ(list1));
    }

    public static List<String> noZ(List<String> strings) {
        strings.removeIf(n -> n.contains("z"));
        return strings;
    }
    public static List<Integer> noTeen(List<Integer> nums) {
/*Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
noTeen([12, 13, 19, 20]) → [12, 20]
noTeen([1, 14, 1]) → [1, 1]
noTeen([15]) → []
 */
        List<Integer> list = new ArrayList<>();
        nums.removeIf(n -> n >= 13 && n <= 19);
        return nums;
    }

    public List<Integer> noNeg(List<Integer> nums) {
/*
 Given a list of integers, return a list of the integers, omitting any that are less than 0.
 noNeg([1, -2]) → [1]
 noNeg([-3, -3, 3, 3]) → [3, 3]
 noNeg([-1, -1, -1]) → []
 */
        List<Integer> list = new ArrayList<>();
        for (Integer each : nums) {
            if (each >= 0) {
                list.add(each);
            }
        }
        return list;
    }

    public static List<Integer> noNeg2(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;

        // OR the equivalent stream solution
        // Note that the boolean logic is opposite
        // return nums.stream()
        //   .filter(n -> n >= 0)
        //   .collect(Collectors.toList());
    }

    //replace all "X" in list
    public List<String> lower(List<String> strings) {

        List<String> list = new ArrayList<>();
        for (String each : strings) {

            String str = each.replace("x", "");
            list.add(str);
        }
        return list;
    }

    public List<Integer> no9(List<Integer> nums) {
/**
 Given a list of non-negative integers, return a list of those numbers except omitting
 any that end with 9.
 no9([1, 2, 19]) → [1, 2]
 no9([9, 19, 29, 3]) → [3]
 no9([1, 2, 3]) → [1, 2, 3]
 */
        List<Integer> list = new ArrayList<>();
        for (Integer each : nums) {
            if (each % 10 != 9) {
                list.add(each);
            }
        }
        return list;
    }

}