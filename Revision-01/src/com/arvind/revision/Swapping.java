package com.arvind.revision;

public class Swapping {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        swap(a, b);
//        System.out.println("a = " + a); //a = 10
//        System.out.println("b = " + b); //b = 20 ;

         //values can't be changed because swapping happens only inside the method
    }
    //primitive datatype, just pass the value
    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = num1;
        System.out.println("temp: " + temp); //temp = 10
        System.out.println("num1: " + num1); //num1 = 20
        System.out.println("num2: " + num2); //num2 = 20
    }
}
