package com;


import java.util.*;

public class Sort_Array {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 4, 5, 2, 3, 1));
        System.out.println(sortList(list));
        int[] arr = {12,2,34,3,12,4,2,4};
        Integer[] intArr = {2,4,3,1,5,7,8,6,5,4,3,2,3,4};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        SortWithCollectionsNoDuplicates(intArr);


    }

    public static ArrayList<Integer> sortList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
    public static void SortArrayWithoutSort(int[] arr){
        int temp=0;
        for(int i = 0; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                } } }
    }
    public static void SortArrayWithoutSort1(int[] nums){
        int temp=0;
        for(int i=0;i<nums.length/2;i++){
            temp=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }
    }
    public static void SortArrayDescending(int[] arr2){
        Arrays.sort(arr2);  //  array will be sorted in Acsending order

        int[] Descending = new int[arr2.length];
        int z=0;
        for(int i = arr2.length-1; i >=0; i-- ) {
            Descending[z] = arr2[i];
            z++;
        }
        System.out.println("Descedning order: "+Arrays.toString(Descending));
    }
    public static void SortWithWile(int[] arr){
        int temp = 0;
        boolean check = true;
        while (check) {
            check = false;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    check = true;
                } } }
        System.out.println(Arrays.toString(arr));
    }
    public static void SortWithCollectionsNoDuplicates(Integer [] arr){
        Set<Integer> set = new TreeSet<>(Arrays.asList(arr));
        Integer[] newArr = set.toArray(new Integer[]{});
        System.out.println(Arrays.toString(newArr));
    }
}
