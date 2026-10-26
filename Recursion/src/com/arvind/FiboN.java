package com.arvind;

public class FiboN {
    public static void main(String[] args) {
        System.out.println(f(-2));
    }
    static int f(int n){
        //base condition
        if(n < 0){
            return -1;
        }
        if(n < 2){
            return n;
        }

        //recurrence relation
        return f(n-1) + f(n - 2);
    }
}
