package com.arvind;

public class Swapo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //swap number code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);
        System.out.println(a + "  " + b);

        String name = "Arvind";
        changeName(name);
        System.out.println(name);

    }

    static void changeName(String naam){
        naam = "Rahul"; //creating a new object
    }

    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

        //only change valid in this function scope
    }
}
