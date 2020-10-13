package com.oop;


public class TestConstrAndLocalVarables {

    int x, y;  //  instance variable

    TestConstrAndLocalVarables(int x, int y){    // in constructor x and y - local variable
        initialize(x,y);
    }
    public void initialize(int x, int y){
        this.x=x*x;   // this part assign instance variable
        this.y=y*y;
    }

    public static void main(String[] args) {
        int x=3, y=5;
        TestConstrAndLocalVarables obj = new TestConstrAndLocalVarables(x,y);
        System.out.println(x+" "+y);  //  Output: 3 5  cos x and y local and it calls directly

        System.out.println(obj.x+" "+ obj.y);  //  //  Output: 9 25 cos instance
    }
}