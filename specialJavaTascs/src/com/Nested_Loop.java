package com;


import java.util.Scanner;

public class Nested_Loop {

    public static void main(String[] args) {

        for(int i=1;i<=7;i++){        //  *
            for(int j =1;j<=i;j++){   //  **
                System.out.print("*");//  ***
            }                         //  ****
            System.out.println();     //  *****
        }                             //  ******

        for(int i=7;i>=1;i--){        //  ******
            for(int j =1;j<=i;j++){   //  *****
                System.out.print("*");//  ****
            }                         //  ***
            System.out.println();     //  **
        }                             //  *



        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter two number");
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println("Summ of your numbers is = " + (a + b));
            System.out.println("You want more?");
            String answer = scan.next();
            while(  ! ( answer.equals("yes") || answer.equals("no") )  ) {
                System.out.println("Invalid Entry please re enter");
                System.out.println("Do you wanna continue");
                answer = scan.next();
            }
            if(answer.equals("no")){
                break;
            } }
        System.out.println("End");
    }
}