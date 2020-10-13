package com;


public class Finn_Ra_FinnRa_Number {
    /*
    Write a program that prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
    print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.
    For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */
    public static void main(String[] args) {
        FINRA();
        System.out.println("====================");
        oneMoreFinRa();
    }

    public static void FINRA() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }

    // one more solution
    public static void oneMoreFinRa() {
        for (int i = 1; i <= 30; i++) {
            String print = "";
            if (i % 3 == 0) print = "FIN";
            if (i % 5 == 0) print += "RA";
            if (print.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(print);
            }
        }
    }

}