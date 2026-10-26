package oop_05.SimpleDemo;

public class Main {
    public static void main(String[] args) {

        Son son = new Son(25);
        son.career();

        son.normal();

        Parent daughter = new Daughter(20);
        daughter.career();

        Parent.hello();
    }
}
