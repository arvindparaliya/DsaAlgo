package com.arvind.easy;
/*
    ==> Need to understand this problem
 */
public class PalinRec {
    static int rev(int n){
        int digits = (int)(Math.log10(n)) + 1;
        //Math.log10(n) -> Calculate the number of digits in n.
        //Math.log10(123) = 2.09 -> int -> 2 + 1 = 3 digits
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits - 1) + helper(n/10, digits-1));
    }
    static boolean palindrome(int n){
        return n == rev(n);
    }

    public static void main(String[] args){
        System.out.println(palindrome(12321)); //problem
    }

}
