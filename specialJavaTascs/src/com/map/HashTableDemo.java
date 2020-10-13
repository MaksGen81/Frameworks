package com.map;


import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableDemo {
    /*
    HashTable
    1. Java Hashtable class implements a hashtable, which maps keys to values.
    2. It inherits Dictionary class and implements the Map interface.
    3. Any non-null object can be used as a key or as a value.
    4. It contains only unique elements.
    5. It may have not have any null key or value.
    6. It is synchronized an thread-safe.
    Declaration:
    Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
     */
    public static void main(String[] args) {

        Hashtable<Integer, String> htable = new Hashtable<>();
        htable.put(3, "Vinod");
        htable.put(6, "Amol");
        htable.put(8, "Nandan");
        htable.put(12, "Yusuf");

        // Iterating over Hashtable
        for (Entry<Integer, String> entry : htable.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }

        System.out.println("Hashtable size= " + htable.size());

        // Checking and searching
        if (htable.containsKey(8)) {
            System.out.println("Hashtable has a given key");
        } else {
            System.out.println("Hashtable hasn't a given key");
        }

        // Remove the content of the Hashtable
        htable.clear();

        // Check if the Hashtable empty
        if (htable.isEmpty()){
            System.out.println("The Hashtable is empty");
        }
    }
}