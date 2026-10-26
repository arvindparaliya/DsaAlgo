package com.arvind.easy;

public class Concept {
    public static void main(String[] args) {
        con(5);
    }
    static void con(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        //concept of --n vs n--
//        con(n--); //stack overflow : error

        con(--n); //subtract first and then pass
    }
}
