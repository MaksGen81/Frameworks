package com.map;


import java.util.*;

public class HashMap_Demo {

    /*
    HashMap
1. A HashMap stores Key & value pairs.
2. It contains only unique elements.
3. It maintains no order.
4. It is similar to the Hashtable class except that it is unsynchronized and permits nulls
5. It may have one null key and multiple null values.
Declaration:
HashMap<Integer, String> hm = new HashMap<>();
or
Map m1 = new HashMap();
     */
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Vinod");
        map.put(6, "Amol");
        map.put(8, "Nandan");
        map.put(12, "Yusuf");

        // Iterating over hashmap
        for (Map.Entry<Integer, String> each : map.entrySet()) {
            Integer key = each.getKey();
            String value = each.getValue();
            System.out.println(key + " " + value);
        }

        System.out.println("HashMap size= " + map.size());

        // Checking and searching
        if (map.containsKey(8)) {
            System.out.println("HashMap has a given key");
        } else {
            System.out.println("HashMap hasn't a given key");
        }

        // Remove the content of the hashMap
        map.clear();

        // Check if the hashMap empty
        if (map.isEmpty()) {
            System.out.println("The hashMap is empty");
        }

        System.out.println("==========================");
        // create map to store
        Map<String, List<String>> map1 = new HashMap<String, List<String>>();

        // create list one and store values
        List<String> valSetOne = new ArrayList<String>();

        valSetOne.add("Apple");
        valSetOne.add("Aeroplane");

        // create list two and store values
        List<String> valSetTwo = new ArrayList<String>();
        valSetTwo.add("Bat");
        valSetTwo.add("Banana");

        // create list three and store values
        List<String> valSetThree = new ArrayList<String>();
        valSetThree.add("Cat");
        valSetThree.add("Car");

        // put values into map
        map1.put("A", valSetOne);
        map1.put("B", valSetTwo);
        map1.put("C", valSetThree);

        // iterate and display values
        System.out.println("Fetching Keys and corresponding [Multiple] Values \n");

        for (Map.Entry<String, List<String>> entry : map1.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values + "\n");
        }
    }
}