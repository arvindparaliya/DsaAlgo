package com.arvind.easy;

public class Reverse {
    public static void main(String[] args) {
        rev1(1234);
    }

    static void rev1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n % 10);
        rev1(n / 10);
    }

}
