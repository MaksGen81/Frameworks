package com.enum_;


public class Enum_In_Java {

    enum Color {
        RED, GREEN, BLUE;
    }

    public static void main(String[] args) {

        Color c1 = Color.RED;
        System.out.println(c1);
        System.out.println("=================");
        String str = "MONDAY";
        Enum_In_Java t1 = new Enum_In_Java(Day.valueOf(str));
        t1.dayIsLike();
    }

    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY;
    }

    Day day;


    // Constructor
    public Enum_In_Java(Day day) {
        this.day = day;
    }

    // Prints a line about Day using switch
    public void dayIsLike() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
}