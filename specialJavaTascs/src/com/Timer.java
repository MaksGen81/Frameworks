package com;


import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Minutes");
        int minutes = scan.nextInt();
        minutes =minutes-1;
        while(minutes>=0){
            int seconds =59;
            while (seconds>0){
                System.out.println(minutes+" minutes and "+seconds+" seconds ");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){}
                --seconds; }
            if(minutes<0)
                break;
            --minutes; }
        System.out.println("BOOOM !");
    } }