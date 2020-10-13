package com;


import java.util.*;

public class ReturnSmalestInteger {
    /*
    Write a function:
class Solution { public int solution(int[] A); }
that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.
Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
     */
    public static void main(String[] args) {

        int [] nums = new int[]{1,3,6,4,1,2};
        System.out.println(solution(nums));
        System.out.println(num(nums));
        int [] a = new int[]{-1,-3};
        System.out.println(mySolution(a));
        int[] A = {1, 2, 3};
        System.out.println(mySolution(A));
        System.out.println(mySolution(nums));

    }

    static int solution(int[] arr) {
        int temp = 0;
        boolean check = true;
        while (check) {
            check = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    check = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        if (arr[arr.length - 1] < 0) {
            return 1;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] < 2) {
                continue;
            } else {
                return arr[i] + 1;
            }
        }
        return arr[arr.length - 1] + 1;
    }

    // next solution
    public static int num(int[] A) {
        List<Integer> list = new ArrayList<>();
        for (int each : A) {
            if(each>0){
                list.add(each);
            }
        }
        Collections.sort(list);
        int number=0;
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(0) !=1){
                return 1;
            }else if(list.get(i)==list.get(i+1)){
                continue;
            } else if (list.get(i) > 0 && (list.get(i + 1) == list.get(i) + 1)) {
                continue;
            } else if (list.get(i) > 0 && (list.get(i + 1) != list.get(i) + 1)) {
                return  number=list.get(i) + 1;
            }
        }
        number=list.get(list.size() - 1) + 1;
        return number;
    }
    /*
    For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.
     */
    public static int mySolution(int[] arr){
        int num=0;
        Arrays.sort(arr);

        if(arr[arr.length-1]<0) {
            num = 1;
            return num;}

        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) < 2) {
                continue;
            } else {
                return arr[i] + 1;
            } }
        return arr[arr.length - 1] + 1;
    }
}