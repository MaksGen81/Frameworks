package com.map;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    /*
    LinkedHashMap
1.A LinkedHashMap contains values based on the key.
2.It may have one null key and multiple null values.
3.This implementation differs from HashMap in that it maintains a doubly-linked list running through
all of its entries.
4.This linked list defines the iteration ordering, which is normally the order in which keys were
inserted into the map (insertion-order).
Declaration:
LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();
     */

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(3, "Vinod");
        map.put(6, "Amol");
        map.put(8, "Nandan");
        map.put(12, "Yusuf");

        // Iterating over linkedHashMap
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }

        System.out.println("LinkedHashMap size= " + map.size());

        // Checking and searching
        if (map.containsKey(8)) {
            System.out.println("LinkedHashMap has a given key");
        } else {
            System.out.println("LinkedHashMap hasn't a given key");
        }

        // Remove the content of the LinkedhashMap
        map.clear();

        // Check if the LinkedhashMap empty
        if (map.isEmpty()){
            System.out.println("The LinkedhashMap is empty");
        }
    }
}
