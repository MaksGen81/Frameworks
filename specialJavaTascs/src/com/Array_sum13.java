package com;


public class Array_sum13 {

    /*
    Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13
    is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
     */


    public static void main(String[] args) {
        int[] nums = {13, 1, 2, 13, 2, 1, 13};
        sum13(nums);
    }
    public static int sum13(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]!=13){
                sum+=nums[i];
                if(i>0 && nums[i-1]==13){
                    sum-=nums[i];
                }

            }
        }
        return sum;
    }
}