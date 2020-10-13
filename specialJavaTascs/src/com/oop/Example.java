package com.oop;


public class Example {

    public static void main(String[] args) {

        C obj = new C();   //  output : A B C
        System.out.println(" ---------------");
        A obj1 = new C();  // output : A B C

    }


}
class A{
    public A(){
        System.out.println("A");
    }
}
class B extends A{
    public B(){
        System.out.println("B");
    }
}
class C extends B{
    public C(){
        System.out.println("C");
    }
}

final class D extends C{  //   final can not be extended and can not be Super class
    D(){                  //  but it can extend sume super class
        System.out.println("D");
    }
}
//class I extends D{   //  NO
//
//}