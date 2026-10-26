package oop_01;

import java.util.Arrays;

public class Classes {
    public static void main(String[] args){
//        Student std = new Student();
//        std.rno = 13;
//        std.name = "Arvind";
//        std.marks = 87.0f;

        Student st = new Student();
        System.out.println(st);

        Student std = new Student();
        System.out.println(std.name);

//        Student st = new Student(23, "Kumar", 88.2f);
//
//        System.out.println(st.rno);
//        System.out.println(st.name);
//        System.out.println(st.marks);


//        std.display();
//        std.greeting();
//        std.changeName();

//        System.out.println(std.rno);
//        System.out.println(std.name);
//        System.out.println(std.marks);
    }
}

//create a class for every student
class Student{
    //instance variable : variable that inside the class.
    int rno;
    String name;
    float marks;

    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other){
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }

    Student(){
        this(12, "default person", 44.5f);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    //    void greeting(){
//        System.out.println("Hello! My name is " + name);
//    }
//
//    void changeName(String name){
//        this.name = name;
//    }
//
//     void display(){
//        System.out.println(rno);
//        System.out.println(name);
//        System.out.println(marks);
//    }
}