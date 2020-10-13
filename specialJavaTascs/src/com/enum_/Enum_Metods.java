package com.enum_;


public class Enum_Metods {

    enum Color
    {
        RED, GREEN, BLUE;
    }

    public static void main(String[] args) {

        // Calling values()
        Color arr[] = Color.values();

        // enum with loop
        for (Color col : arr)
        {
            // Calling ordinal() to find index
            // of color.
            System.out.println(col + " at index "
                    + col.ordinal());
        }

        // Using valueOf(). Returns an object of
        // Color with given constant.
        // Uncommenting second line causes exception
        // IllegalArgumentException
        System.out.println(Color.valueOf("RED"));
        // System.out.println(Color.valueOf("WHITE"));

        // Answer :
        // RED at index 0
        //GREEN at index 1
        //BLUE at index 2
        //RED
    }
}