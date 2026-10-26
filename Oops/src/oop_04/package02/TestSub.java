package oop_04.package02;

import oop_04.package01.A;

public class TestSub extends A {

    public TestSub(int num, String name, int rollNo) {
        super(num, name, rollNo);
    }

    public static void main(String[] args) {
        TestSub obj = new TestSub(10, "Ankit", 301);
        String naam = obj.name; //protected can access in diff package but in subclass of parents
//        int roll = obj.rollNo; //default access modifier can't access in another package's subclass
        System.out.println(naam);
    }
}
