package com;


import java.util.*;

public class RemuveDuplicatesFromArrayAndReturneNewArry {

    public static void main(String[] args) {

        Integer[] numbers = new Integer[] {3,4,3,4,5,1,3,5,6};
        int [] arr = {2,4,3,6,3,2};
        System.out.println(Arrays.toString(ReturnArrayWithoutDuplicates(numbers)));

        unique_array(arr);
    }

    public static Integer[] ReturnArrayWithoutDuplicates(Integer[] arr){
        LinkedHashSet<Integer> linkArr=new LinkedHashSet<>(Arrays.asList(arr));
        Integer[] newArr = linkArr.toArray(new Integer[]{});
        return newArr;
    }


    static void unique_array(int[] my_array)
    {


        int no_unique_elements = my_array.length;

        //Comparing each element with all other elements

        for (int i = 0; i < no_unique_elements; i++)
        {
            for (int j = i+1; j < no_unique_elements; j++)
            {
                //If any two elements are found equal

                if(my_array[i] == my_array[j])
                {
                    //Replace duplicate element with last unique element

                    my_array[j] = my_array[no_unique_elements-1];

                    no_unique_elements--;

                    j--;
                }
            }
        }

        //Copying only unique elements of my_array into array1

        int[] array1 = Arrays.copyOf(my_array, no_unique_elements);

        //Printing arrayWithoutDuplicates

        System.out.println();

        System.out.println("Array with unique values : ");

        for (int i = 0; i < array1.length; i++)
        {
            System.out.print(array1[i]+"\t");
        }

        System.out.println();

        System.out.println("---------------------------");
    }}