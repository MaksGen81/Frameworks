package com.oop;


interface Shape{
    public double area();
}

class Circle implements Shape{
    double radius;
    public Circle(double r){
        radius = r;
    }

    public double area(){
        return 3.14 * radius * radius;
    }
}
class Rectangle implements Shape{
    double length;
    double breadth;
    public Rectangle(double l, double b){
        length = l;
        breadth = b;
    }
    public double area(){
        return length * breadth;
    }
}
class InterfaceDemo{
    public static void main(String args[]){
        Circle c = new Circle(2.5);
        System.out.println("Area of circle: " + c.area());
        Rectangle r = new Rectangle(5.0, 2.5);
        System.out.println("Area of rectangle: " + r.area());
    }
}