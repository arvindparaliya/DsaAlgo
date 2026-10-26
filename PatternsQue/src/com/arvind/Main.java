package com.arvind;

public class Main {
    public static void main(String[] args){
        //pattern2(5);
        //pattern3(5);
        pattern28(5);
        //pattern5(5);
    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern28(int n){
        //upper part
        for (int i = 1; i <= n; i++) {
            //print spaces
            for (int s = 1; s <= n - i ; s++) {
                System.out.print(" ");
            }
            //print start
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //lower part
        for (int i = n - 1; i >=1; i--) {
            //space
            for (int s = 1; s <= n - i ; s++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = n - 1; j >= i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = n; col >=row ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patter1(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int cols = 1; cols <= row; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
