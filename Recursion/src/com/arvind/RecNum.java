package com.arvind;

public class RecNum {
    public static void main(String[] args) {

        print(1);
    }

    //Recursion : A function calling itself again and again
    static void print(int n){

        //base condition OR stop condition
        if(n == 5){
            return;
        }

        //print numbers
        System.out.println(n);

        //Recursive call
        //if you are calling a function again and again , you can treat as a separate call in the stack
        print(n + 1); //this is called tail recursive call
        //this is the last function call
    }
}
