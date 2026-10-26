package com.arvind;

import java.util.Arrays;
//rows and cols sorted
public class MatrixSearch {
    public static void main(String [] args){
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
                //here 10 is lower-bound and 40 is upper-bound
        };
        int target = 50;

        System.out.println(Arrays.toString(search(arr, target)));

    }
    static int[] search(int[][] matrix, int target){
        int r = 0; //lower-bound
        int c = matrix.length - 1;//upper-bound

        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r, c};
            }
            if(matrix[r][c] < target){
                r++;
            }
            else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
