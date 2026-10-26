package oop_03.abstraction;

abstract class Student {

    private String name;
    private int rollNo;
    private double marks;

    public Student (String name, int rollNo, double marks) {
        this.name = name;
        this.marks = marks;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Roll No. : " + rollNo);
        System.out.println("Marks : " + marks);
    }
}

