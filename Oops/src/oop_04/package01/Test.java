package oop_04.package01;

public class Test extends A{

    public Test(int num, String name, int rollNo) {
        super(num, name, rollNo);
    }

    public static void main(String[] args) {
        Test t = new Test(10, "Bhautik", 502);
        String ans = t.name;

        int rol = t.rollNo;
        System.out.println(rol);
    }
}
