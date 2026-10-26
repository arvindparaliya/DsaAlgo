package com.arvind;

public class Shadowing {
    static int a = 90; //this will be shadowed by line 9

    public static void main(String[] args) {
        System.out.println(a); //ans : 90

        int a; //the class variable at line 4 is shadowed by this
        a = 10; //scope will begin when value is initialised
        System.out.println(a); //10

        fun(); //90

    }

    static void fun(){
        System.out.println(a); //90
    }
}
