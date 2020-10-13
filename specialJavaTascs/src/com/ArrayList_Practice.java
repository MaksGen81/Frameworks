package com;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayList_Practice {

    public static void main(String[] args) {

        ArrayList<String> lst = new ArrayList<>();
        lst.add("Jon Snow");
        lst.add("Sansa Stark");
        lst.add("Arya Stark");
        lst.add(1, "Bran Stark");
        lst.add(3, "Tony Stark");
        System.out.println("Original lst = \n\t" + lst);
        System.out.println("lst.size() = " + lst.size());
        System.out.println("lst.isEmpty() = " + lst.isEmpty());
        System.out.println("\nfirst item lst.get(0) = " + lst.get(0));
        System.out.println("second item lst.get(1) = " + lst.get(1));
        System.out.println("last item of any ArrayList object \n\t lst.get(lst.size()-1) ="
                + lst.get(lst.size() - 1));
        lst.set(3, "Rob Stark");
        System.out.println("\nAfter replacing element with new value at index 3 lst = \n\t" + lst);
        lst.remove("Rob Stark");
        System.out.println("After replacing Rob Stark from the lst = \n\t" + lst);
        lst.remove(1);
        System.out.println("After removing element at index 1 lst = \n\t" + lst);
        System.out.println("\nlst.contains(\"Rob Stark\") = " + lst.contains("Rob Stark"));
        System.out.println("lst.indexOf(\"Arya Stark\") = " + lst.indexOf("Arya Stark"));
        System.out.println("lst.lastIndexOf(\"Jon Snow\") = " + lst.lastIndexOf("Jon Snow"));
        System.out.println("\niterating over a list using for loop");
        for (int i = 0; i < lst.size(); i++) {
            System.out.println("\tlst.get(" + i + ") = " + lst.get(i));
        }
        System.out.println("\niterating over a list using for loop in reverse order ");
        for (int i = lst.size() - 1; i >= 0; i--) {
            System.out.println("\tlst.get(" + i + ") = " + lst.get(i));
        }
        System.out.println("\niterating over a list using for each loop");
        for (String each : lst) {
            System.out.println("\teach = " + each);
        }
        System.out.println("\nCopying everything in lst to lst2");
        ArrayList<String> lst2 = new ArrayList<>(lst);
        System.out.println("lst2 = " + lst2);
        System.out.println("\nGetting array out of lst");
        String[] arrOutOfList = lst.toArray(new String[0]);
        System.out.println("Array object we got from the list using lst.toArray(new String[0]) \n\t"
                + Arrays.toString(arrOutOfList));
        lst.sort(Comparator.naturalOrder());
        System.out.println("After Sorting in low to high (natural) order = \n\t" + lst);
        lst.sort(Comparator.reverseOrder());
        System.out.println("After Sorting in high to low (reverse) order = \n\t" + lst);
        Arrays.sort(arrOutOfList, Comparator.reverseOrder());
    }}
