package com;

public class Array_sum67 {

    /*
    Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and
    extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
     */
    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 6, 99, 99, 7};
        System.out.println(sum67(nums));
        int[] num = {1, 1, 6, 7, 2};
    }

    // [1, 2, 2, 6, 99, 99, 7]
    public int sum67_1(int[] nums) {
        int sum = 0;
        boolean stop = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6)
                stop = true;
            if (stop == false)
                sum += nums[i];
            if (nums[i] == 7 && stop == true)
                stop = false;
        }
        return sum;
    }


    public static int sum67(int[] nums) {

        int sum = 0;
        int annul7 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                for (int j = i; nums[j] != 7; j++) {
                    nums[j] = 0;
                    annul7 = j;
                }
                nums[annul7 + 1] = 0;
            } else
                sum += nums[i];
        }
        return sum;
    }


    public int sum67_2(int[] nums) {
        int sum  = 0;
        boolean stop = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==6) stop=true;
            if(!stop)sum += nums[i];
            if(nums[i]==7) stop=false;
        }
        return sum;
    }

}