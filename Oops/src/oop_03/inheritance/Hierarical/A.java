package oop_03.inheritance.Hierarical;

public class A {
    int a;
    double b;
    short c;

    public A(int a, double b, short c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "a ="+ a + ", b = " + b + ", c =" + c;
    }
}
