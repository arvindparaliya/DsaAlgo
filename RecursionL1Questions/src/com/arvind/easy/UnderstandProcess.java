package com.arvind.easy;

public class UnderstandProcess {
    public static void main(String[] args) {
//        print(1);
//        funRev(5);
        both(5);
    }
    static void fun(int n){
        if(n == 0){
            return;
        }
        fun(n - 1);
        System.out.println(n);
    }

    static void funRev(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        funRev(n - 1);
    }

    static void both(int n){
        if(n == 0){
            return;
        }
        System.out.println(n); // main -> 5 4 3 2 1
        both(n - 1);
        System.out.println(n); //main -> 1 2 3 4 5
    }

//    static void print(int n){
//        if(n == 5){
//            System.out.println(n);
//            return;
//        }
//        System.out.println(n);
//        print(n + 1);
//    }
}
