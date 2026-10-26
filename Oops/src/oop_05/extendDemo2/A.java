package oop_05.extendDemo2;

public interface A {

    //static interface method should always have a body
    //call via the interface name

    static void greet(){
        System.out.println("Hey! I am in static method");
    }
    static void fun(){
        System.out.println("I am in A");
    }
}