package com.arvind;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans = sum1(2, 4);
//        System.out.println(ans);

//        int ans = sum2();
//        System.out.println(ans);

//        sum3();

    }

    //pass the value when you call the method in main()
//    static int sum1(int a, int b){
//        int sum = a + b;
//        return sum;
//    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first num");
        int a = in.nextInt();
        System.out.println("Enter the second num");
        int b = in.nextInt();
        System.out.print("Sum of two numbers is :");
        int sum = a + b;
        return sum;
        //after the return statement nothing will execute
        //mean return statement is the end of method
    }
    static void sum3(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first num");
        int a = in.nextInt();
        System.out.println("Enter the second num");
        int b = in.nextInt();
        System.out.print("Sum of two numbers is :");
        int sum = a + b;
        System.out.println(sum);

    }
}
