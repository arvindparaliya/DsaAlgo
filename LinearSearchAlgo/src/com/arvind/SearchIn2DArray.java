package com.arvind;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 22, 33},
                {31, 23, 30, 6},
                {19, 11, 34, 99, 55},
                {10, 20}
        };
//        int target = 34;
//        int [] ans = search(arr, target);
//        System.out.println(Arrays.toString(ans));

        int maxAns = max(arr);
        System.out.println(maxAns);

        int minAns = min(arr);
        System.out.println(minAns);

        System.out.println(Integer.MIN_VALUE);
        System.out.print(Integer.MAX_VALUE);

    }
    static int[] search(int[][] num, int target){
        //assume the given array length is not zero
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length ; col++) {
                if(num[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
//    static int max(int[][] num){
//        int max = Integer.MIN_VALUE; //MIN_VALUE is wrapper class which helps to find the min value in the array
//        //means we don't have any smaller value that this
//        for (int row = 0; row < num.length; row++) {
//            for (int col = 0; col < num[row].length ; col++) {
//                if(num[row][col] > max){
//                    max = num[row][col];
//                }
//            }
//        }
//        return max;
//    }

    static int max(int[][] num){
        int max = Integer.MIN_VALUE; //Integer is the class which contains min value
        // MIN_VALUE is wrapper class which helps to find the min value in the array
        //means we don't have any smaller value that this
        for (int[] ints : num) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
    static int min(int[][] num){
        int min = Integer.MAX_VALUE;
        for (int[] ints : num) {
            for (int element : ints) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }

}
