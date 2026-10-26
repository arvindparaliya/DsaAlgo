package com.arvind;

//array sorted in strictly manner
public class StrictlySortedArray {
    int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10 ,11, 12},
            {13, 14, 15, 16}

    };
    int target = 6;

    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length -1;

        return new int[]{row, col};
    }
}
