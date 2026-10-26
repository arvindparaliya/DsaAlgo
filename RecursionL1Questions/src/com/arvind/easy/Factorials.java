package com.arvind.easy;

public class Factorials {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }
    static int fact(int n){
        //imagine we are not put any negative numbers
        //base condition
        if(n <= 1){
            return 1;
        }
        //recurrence relation
        return n * fact(n - 1);
    }
}
