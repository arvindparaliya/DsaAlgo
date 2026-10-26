package oop_03.polymorphism.compileTime;

public class Main {
    public static void main(String[] args) {

        Calculator c1 = new Calculator(2, 3, 4);

        Calculator c = new Calculator();

        int first = c1.add(1, 2);
        double second = c1.add(1.3, 2.2);

        System.out.println(first);
        System.out.println(second);
    }
}
