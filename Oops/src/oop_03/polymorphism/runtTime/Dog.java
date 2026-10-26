package oop_03.polymorphism.runtTime;

public class Dog extends Animal{
    //same method and same type of arguments

    @Override
    void sound(){
        System.out.println("Dog barks.");
    }
}
