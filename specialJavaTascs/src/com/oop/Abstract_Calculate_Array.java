package com.oop;

import java.util.Arrays;
import java.util.List;

public class Abstract_Calculate_Array {

    public static void main(String[] args) {
        Addition2 a = new Addition2(124,55);    a.calculate();
        Addition2 a2 = new Addition2(23,55);    a2.calculate();
        Addition2 a3 = new Addition2(454,55);   a3.calculate();
        Addition2 a4 = new Addition2(124,678);  a4.calculate();
        Addition2 a5 = new Addition2(1,55);     a5.calculate();
        Devision2 d = new Devision2(2,6);       d.calculate();
        Devision2 d1 = new Devision2(0,10);     d1.calculate();
        Devision2 d2 = new Devision2(10,0);     d2.calculate();
        List<Question2> allQuest = Arrays.asList(a,a2,a3,a4,a5,d,d1,d2);
        for(Question2 each : allQuest){
            System.out.println(each);
        } } }
abstract  class Question2{
    int num1;
    int num2;
    String operator;
    int answer;
    boolean calculated;
    String questionType = "Unknown";
    abstract void calculate();

    public Question2(String guestionType,String operator){
        this.questionType=guestionType;
        this.operator=operator;
    }
    public String toString (){

        return "this "+questionType;
    } }
class Addition2 extends Question2{
    public Addition2(int num1, int num2) {
        super("addition question is ", " + ");
        int temp=0;
        if(num1<num2){
            temp=num1;
            num1=num2;
            num2=temp;
        }
        this.num1=num1; this.num2=num2; }
    @Override
    void calculate() {
        answer=num1+num2;
        calculated=true; }
    @Override
    public String toString (){
        if(calculated==true){ return super.toString()+num1+operator+num2+" = "+answer;
        }else {return super.toString()+num1+operator+num2+" = ";
        } } }

class Devision2 extends Question2{

    public Devision2(int num1, int num2) {
        super("addition question is ", " * ");
        this.num1=num1; this.num2=num2;
    }
    @Override
    void calculate() {
        if(num1==0 || num2==0){
            answer=0;
        }else { answer=num1*num2;
        }
        calculated=true;
    }
    public String toString(){
        if(calculated==true){ return super.toString()+num1+operator+num2+" = "+answer;
        }else {return super.toString()+num1+operator+num2+" = ";
        } }
}
