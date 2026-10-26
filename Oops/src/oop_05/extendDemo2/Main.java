package oop_05.extendDemo2;


public class Main implements A, B {

    @Override
    public void greet() {
    }

    @Override
    public void fun() {
    }


    public static void main(String[] args) {
        Main obj = new Main();
        obj.greet();

//        A.greet();

    }
}
