package oop_04.package01;

public class Main {
    public static void main(String[] args) {

        A obj = new A(10, "Rahul", 101);

        int a = obj.getNum(); //private
        String ans = obj.name; //protected

        int rol = obj.rollNo;

        System.out.println(rol);

    }
}
