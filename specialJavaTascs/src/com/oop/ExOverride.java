package com.oop;


public class ExOverride {

    public static void main(String[] args) {

        Test obj = new Franco();
        obj.print();             //   Output: Franco
        System.out.println("------------");
        Tarah obj1 = new Tarah();
        obj1.print();            //   Output: Franco

    }

}
class Test{
    public void print(){
        System.out.println("Test");
    }
}
class Franco extends Test{
    public void print(){
        System.out.println("Franco");
    }
}
class Tarah extends Franco{

}