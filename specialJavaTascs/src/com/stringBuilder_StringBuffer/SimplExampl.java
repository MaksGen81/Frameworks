package com.stringBuilder_StringBuffer;


public class SimplExampl {
    public static void main(String[] args) {



    }

    public static void Test1(){
        String str = "Geeks";

        // conversion from String object to StringBuffer
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println(sbr);

        // conversion from String object to StringBuilder
        StringBuilder sbl = new StringBuilder(str);
        sbl.append("ForGeeks");
        System.out.println(sbl);

        // Answer:
        // skeeG
        //GeeksForGeeks
    }

    public static void Test2(){
        StringBuffer sbr = new StringBuffer("Geeks");
        StringBuilder sbdr = new StringBuilder("Hello");

        // conversion from StringBuffer object to String
        String str = sbr.toString();
        System.out.println("StringBuffer object to String : ");
        System.out.println(str);

        // conversion from StringBuilder object to String
        String str1 = sbdr.toString();
        System.out.println("StringBuilder object to String : ");
        System.out.println(str1);

        // changing StringBuffer object sbr
        // but String object(str) doesn't change
        sbr.append("ForGeeks");
        System.out.println(sbr);
        System.out.println(str);

        // Answer :
        // StringBuffer object to String :
        //Geeks
        //StringBuilder object to String :
        //Hello
        //GeeksForGeeks
        //Geeks
    }
    public static void Test3(){
        StringBuffer sbr = new StringBuffer("Geeks");

        // conversion from StringBuffer object to StringBuilder
        String str = sbr.toString();
        StringBuilder sbl = new StringBuilder(str);

        System.out.println(sbl);

        // Answer: Geeks
    }
}