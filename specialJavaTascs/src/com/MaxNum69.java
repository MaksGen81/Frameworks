package com;


public class MaxNum69 {

    /*
    Given a positive integer num consisting only of digits 6 and 9.
Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
Example 1:
Input: num = 9669
Output: 9969
Explanation:
Changing the first digit results in 6669.
Changing the second digit results in 9969.
Changing the third digit results in 9699.
Changing the fourth digit results in 9666.
The maximum number is 9969.
     */

    public static int maxNumberWith69(int num){

        int result=0;
        String res="";
        boolean check=true;

        String[] arr = String.valueOf(num).split("");
        for (int i=0;i<arr.length;i++){

            if(arr[i].equals("6") && check){
                arr[i]="9";
                check=false;
            }
            res+=arr[i];
        }
        result=Integer.parseInt(res);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxNumberWith69(9669));
    }

}