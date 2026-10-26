package oop_03.polymorphism.runtTime;

public class Main {
    public static void main(String[] args) {

        Animal a = new Dog();
        a.sound(); //answer come from Dog class
        //because in overriding memory allocate at dynamic/runtime
    }
}
