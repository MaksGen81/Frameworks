package com.cillectors;


import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
class Student2{
    int id;
    String name;
    int age;
    public Student2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class Getting_the_average_age_of_students {
    public static void main(String[] args) {
        List<Student2> studentlist = new ArrayList<Student2>();
        //Adding Students
        studentlist.add(new Student2(11,"Jon",22));
        studentlist.add(new Student2(22,"Steve",18));
        studentlist.add(new Student2(33,"Lucy",22));
        studentlist.add(new Student2(44,"Sansa",23));
        studentlist.add(new Student2(55,"Maggie",18));
        //Getting the average Age
        Double avgAge = studentlist.stream()
                .collect(Collectors.averagingInt(s->s.age));
        System.out.println("Average Age of Students is: "+avgAge);
    }
}