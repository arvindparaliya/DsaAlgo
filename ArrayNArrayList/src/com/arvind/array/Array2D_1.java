package com.arvind.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
            1 2 3
            4 5 6
            7 8 9

            int[][] arr = new int[rows][cols];

            int[][] arr = new int[3][];

            int[][] arr = {
                    {1, 2, 3}, //0th index
                    {4, 5},    //1st index
                    {6, 7, 8, 9} //2nd index ->arr[2] = {6, 7, 8, 9}
         */

        int[][] arr = new int[3][4];
//        System.out.println(arr.length); //no of rows

        //input
        for(int row =0; row < arr.length; row++){
            //for each col in every row
            for (int col = 0; col < arr[row].length ; col++) {
                //arr[1].length -> no. of element in row 1->3
                arr[row][col] = in.nextInt();
            }
        }

        //output : 1
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        //output : 2
//        for (int row = 0; row < arr.length ; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //output : 3
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
