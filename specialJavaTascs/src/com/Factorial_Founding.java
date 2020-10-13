package com;


import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;


public class Factorial_Founding {


    public static class Factorial {

        int fact(int n) {
            int result;
            if (n == 1) {
                return 1;
            }
            result = fact(n - 1) * n;
            return result;
        }
    }

    static int factorial(int x){
        int result=1;
        for (int i = 1; i <= x; i++)
        {
            result *= i;  // 1*1=1, 1*2=2, 2*3=6, 6*4=24, 24*5=120
        }
        return  result;
    }

    public static void main(String args[]) {
        Factorial f = new Factorial();
        System.out.println("Факториал 5 равен " + f.fact(5));
        System.out.println(factorial(5));

    }
}