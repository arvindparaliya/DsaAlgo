package com.arvind.easy;

public class DigitSumR {
    public static void main(String[] args) {

        int ans = sumOfDigit(12345);
        System.out.println(ans);
    }
    static int sumOfDigit(int n){
        //base condition
        if(n == 0){
            return 0;
        }
        //n % 10 gives last digit and add with left-numbers
        return (n % 10) + sumOfDigit(n /10);


    }
}
