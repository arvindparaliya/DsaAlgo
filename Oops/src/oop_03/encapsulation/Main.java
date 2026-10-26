package oop_03.encapsulation;

public class Main {
    public static void main(String[] args) {

        Student std = new Student();

        std.setName("Kano");
        std.setRollNo(101);
        std.setMarks(84.2);

        std.display();
    }
}
