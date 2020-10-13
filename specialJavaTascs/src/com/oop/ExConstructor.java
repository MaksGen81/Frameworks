package com.oop;


public class ExConstructor {
    public static void main(String[] args) {

        BB obj = new BB();        // output AA BB
        System.out.println(" ---------------");
        AA obj2 = new AA(10);  // output AA
        System.out.println(" ---------------");
        AA obj3 = new BB();       // output AA BB
    }
}
class AA{
    public AA(int i){               // not default constructor
        System.out.println("AA");
    }
}
class BB extends AA{

    public BB(){
        super(10);               //  mandatory or compile error
        System.out.println("BB");
    }
}