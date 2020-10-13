package com;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Data_Now {
    public static void main(String[] args) {

        SimpleDateFormat sf=new SimpleDateFormat("yyyy : MM : dd");
        System.out.println(sf.format(new Date()));

        Date date = new Date();
        System.out.println(date);

    }
}