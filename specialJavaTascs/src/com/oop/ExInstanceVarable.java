package com.oop;

public class ExInstanceVarable {
    public static void main(String[] args) {

        Test1 obj=new Test1();   //  Every class has it is own copy of instance
        obj.Inumber = 20;
        System.out.println(obj.Inumber);  //   Output: 20

        Test1 obj2 = new Test1();
        System.out.println(obj2.Inumber);  //  Output: 10
        System.out.println("-----------------");
        Te obj3 = new Te();  // static variable means one copy for all objects
        obj3.InSt = 35;
        System.out.println(obj3.InSt); // Output: 35

        Te obj4 = new Te();
        System.out.println(obj4.InSt); // Output: 35
    }
}
class Test1{
    int Inumber = 10;
}

class Te{
    static int InSt = 20;
}
