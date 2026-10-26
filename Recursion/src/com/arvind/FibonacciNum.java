package com.arvind;

public class FibonacciNum {
    public static void main(String[] args) {
        int ans = Fibo(6);
        System.out.println(ans);
    }
    static int Fibo(int n){
        if(n < 0){
            throw new IllegalArgumentException("Negative numbers are not allowed in Fibo.");
        }
        //base condition
        if(n < 2){
            return n;
        }
        //recurrence relation
        return Fibo(n - 1) + Fibo(n - 2);
    }
}
