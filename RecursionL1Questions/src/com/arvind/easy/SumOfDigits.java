package com.arvind.easy;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sum(n));
    }
    static int sum(int n){
        int tempSum = 0;
        while (n > 0){
            int digit = n % 10; //when we take modulo then we got remainder as a last digit
            //in this case our number is 12345 when we take % , we got 5 as a remainder
            tempSum += digit; // add 5 with tempSum=> 0 + 5 = 5
            n = n/10; //now out number is 1234
            //every time we exclude the last digit
        }
        return tempSum;

    }

}
