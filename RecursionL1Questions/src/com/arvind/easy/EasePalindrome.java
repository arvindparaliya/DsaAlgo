package com.arvind.easy;
/*
    ==>|Q|: Need to understand this problem
 */
public class EasePalindrome {

    static boolean isPalindrome(int n){
        return n == reverse(n, n);
    }
    static int reverse(int n, int temp){
        if(n == 0){
            return temp;
        }
        temp = (temp * 10) + (n % 10);
        return reverse(n/10, temp);
    }

    public static void main(String[] args) {
        int num = 12321;
        System.out.println(isPalindrome(num));
    }
}
