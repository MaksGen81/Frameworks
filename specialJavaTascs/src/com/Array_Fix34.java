package com;


import java.util.Arrays;

public class Array_Fix34 {

    public static void main(String[] args) {
        int[] ar = {1, 3, 1, 4, 4, 3, 1};
        System.out.println(Arrays.toString(fix34(ar)));

    }

    public static int[] fix34(int[] nums) {
        int j = 1;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 3 && nums[i + 1] != 4) {
                for (; nums[j] != 4; j++) ;
                nums[j] = nums[i + 1];
                nums[i + 1] = 4;
            }
        }
        return nums;
    }
}