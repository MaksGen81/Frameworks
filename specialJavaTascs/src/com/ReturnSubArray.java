package com;


import java.util.Arrays;

public class ReturnSubArray {
    public static void main(String[] args) {

        /*
         Write a function that will take int[] arr, int n as parameters and return subarray[n]
          with the largest sum.
         Example: input: arr[]{5,5,1,2,10}, 3
		 return {1, 2, 10}
         */

        int[] arr=new int[]{5,5,1,2,10};
        System.out.println(Arrays.toString(largestSubArray(arr,3)));

    }
    public static int [] largestSubArray(int[] arr, int subLength){

        int sum=0,finalSum=0;

        int [] subArr=new int[subLength];
        int[] result=new int[subLength];

        for (int i=0;i<=arr.length-subLength;i++) {
            sum = 0;
            for (int j = i,k=0;j<i+subLength;j++,k++){
                sum+=arr[j];
                subArr[k]=arr[j];
            }
            if(sum>finalSum){
                finalSum=sum;
                for(int j=0;j<subLength;j++){
                    result[j]=subArr[j];
                }
            }


        }
        return result;
    }

}