package com.map;

import java.util.*;
public class MapForEchLoop {

    public static void main(String[] arg)
    {
        Method_1();
    }

    public static void Method_1(){
        Map<String,String> gfg = new HashMap<String,String>();

        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");

        // using keySet() for iteration over keys
        for (String name : gfg.keySet())
            System.out.println("key: " + name);

        // using values() for iteration over keys
        for (String url : gfg.values())
            System.out.println("value: " + url);
    }
    public static void Method_2(){
        Map<String,String> gfg = new HashMap<String,String>();

        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");

        // using keySet() for iteration over keys
        for (String name : gfg.keySet())
            System.out.println("key: " + name);

        // using values() for iteration over keys
        for (String url : gfg.values())
            System.out.println("value: " + url);
    }

    public static void Method_3(){
        Map<String,String> gfg = new HashMap<String,String>();

        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");

        // using iterators
        Iterator<Map.Entry<String, String>> itr = gfg.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<String, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
    }

    public static void Method_4(){
        Map<String,String> gfg = new HashMap<String,String>();

        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");

        // forEach(action) method to iterate map
        gfg.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));

    }
}