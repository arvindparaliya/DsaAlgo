package com.arvind.paraliya;


import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String [] args){

       Scanner in = new Scanner(System.in);

//       int[] arr = new int[5];

       //array of primitives
//        System.out.println("Enter the size of an array :");
//        int[] arr = new int[in.nextInt()]; //mandatory to define size

//        arr [0] = 23;
//        arr [1] = 123;
//        arr [2] = 233;
//        arr [3] = 234;
//        arr [4] = 2;

        //print array of 2nd index
//        System.out.println(arr[2]); //ans.: 233

//        System.out.println("Enter the arrays numbers :");
//        for (int i = 0; i <arr.length; i++) {
//            System.out.print(in.nextInt() + " ");
//        }

//        System.out.println("Enter the arrays numbers :");
//        for (int roll : arr) {  // for every elements in array , print the element
//            System.out.print(in.nextInt() + " "); //here roll represents elements of the array
//        }
//

        String [] str = new String[4];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str)); //print in the array form [aman, bam, cam, dam]

        //modify
        //Array is mutable means we can change or update the array later
        str[0] = "Ram";
        System.out.println(Arrays.toString(str));

    }
}
