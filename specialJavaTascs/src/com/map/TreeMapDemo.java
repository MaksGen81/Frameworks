package com.map;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    /*
    TreeMap
1. TreeMap class implements Map interface similar to HashMap class.
2. The main difference between them is that HashMap is an unordered
collection while TreeMap is sorted in the ascending order of its keys.
3. TreeMap is unsynchronized collection class.
Declaration:
TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
     */
    public static void main(String[] args) {

        TreeMap<Integer, String> tmap = new TreeMap();
        tmap.put(33, "Pune");
        tmap.put(11, "Mumbai");
        tmap.put(44, "Nagpur");
        tmap.put(22, "Nasik");

        // Iterating over hashmap
        for (Map.Entry<Integer, String> entry : tmap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }

        System.out.println("LinkedHashMap size= " + tmap.size());

        // Checking and searching
        if (tmap.containsKey(22)) {
            System.out.println("LinkedHashMap has a given key");
        } else {
            System.out.println("LinkedHashMap hasn't a given key");
        }

        // Remove the content of the hashMap
        tmap.clear();

        // Check if the hashMap empty
        if (tmap.isEmpty()){
            System.out.println("The LinkedhashMap is empty");
        }
    }
}