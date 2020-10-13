package com.oop;


public class InterfacePractice {


}

interface Car{

    void driven();           //  in interface only abstracts methods and abstract key word not necessary
    abstract void stops();

}

abstract class Toyota implements Car{

    public void driven(){
        System.out.println("Toyota drive");  //  you can or nat Override methods of interface in abstract class it is not mandatory
    }

}
class Corolla extends Toyota{
    @Override
    public void stops(){                         // in regular class you mast Override method of interface class if you inherit
        System.out.println("Corolla stops");
    }
}