package oop_03.inheritance.Hierarical;


public class B extends A{
    int r;

    public B(int a, double b, short c, int r) {
        super(a, b, c);
        this.r = r;
        System.out.println("I am in B");
        System.out.println(r);
    }
}
