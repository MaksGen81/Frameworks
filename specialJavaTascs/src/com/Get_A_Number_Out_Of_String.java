package com;


public class Get_A_Number_Out_Of_String {

    public static void main(String[] args) {
        String strNum = "100";
        int num = Integer.parseInt(strNum);                    //   num = 100
        System.out.println("num = "+num);

        String empID = "FB-457";
        int id = Integer.parseInt(empID.split("-")[1]);
        System.out.println("id - "+id);                        //  id - 457


        String twoNumbers = "100,600";
        int sum = Integer.parseInt(twoNumbers.split(",")[0]+twoNumbers.split(",")[1]);  //  100600
        System.out.println(sum);

        String num1Str = "100";
        String num2Str = "600";
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        System.out.println("sum of num1 and num2 = " + (num1 + num2)); //  sum of num1 and num2 = 700
    }
}