package com.arvind;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {

        //Fibonacci Series
        // 0, 1, 1, 2, 3, 5, 8,..

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 2 ;

        while(count <= num){
            int temp = b;
            b = b + a;
            a = temp;
            count ++;

        }
        System.out.println(b);
    }
}
