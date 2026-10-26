package oop_03.encapsulation;

public class Student {

    //data hiding using 'private' keyword
    private String name;
    private int rollNo;
    private double marks;

    //access through getters and setters methods
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

    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Roll No. : " + rollNo);
        System.out.println("Marks : " + marks);
    }
}
