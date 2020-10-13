package com.cillectors;


import java.util.stream.Collectors;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
class Student1{
    int id;
    String name;
    int age;
    public Student1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}


public class Collecting_Data_as_Set {
    public static void main(String[] args) {
        List<Student1> studentlist = new ArrayList<Student1>();
        //Adding Students
        studentlist.add(new Student1(11,"Jon",22));
        studentlist.add(new Student1(22,"Steve",18));
        studentlist.add(new Student1(33,"Lucy",22));
        studentlist.add(new Student1(44,"Sansa",23));
        studentlist.add(new Student1(55,"Maggie",18));
        //Fetching student data as a Set
        Set<Student1> students = studentlist.stream()
                .filter(n-> n.id>22)
                .collect(Collectors.toSet());
        //Iterating Set
        for(Student1 stu : students) {
            System.out.println(stu.id+" "+stu.name+" "+stu.age);
        }
    }
}