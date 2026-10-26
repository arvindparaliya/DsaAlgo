package oop_03.inheritance.Hierarical;

public class Main {
    public static void main(String[] args) {
//
//        A obj = new A(2, 3.0, (short) 4);
//        System.out.println(obj);

        B obj1 = new B(1, 2.0, (short) 1, 2);
        System.out.println(obj1);

        C obj2 = new C(2, 2.0, (short) 2);
        System.out.println(obj2);

        D obj3 = new D(3, 3.0, (short) 3);
        System.out.println(obj3);

    }
}
