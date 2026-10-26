package com.arvind.recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        bubble(arr, arr.length - 1, 0);
        //arr.length - 1 = number of passes needed
        //i = 3 -> represent the number of elements to sort in this pass
        //j = 0 -> current index we are comparing
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr, int i, int j){
        //i = how many elements we need to check (outer loop)
        //j = where we are in the current checking (inner loop)

        if(i == 0){
            //if only one element is left the array is sorted and stop the recursion
            return;
        }
        if(j < i){

            if(arr[j] > arr[j + 1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            bubble(arr, i, j + 1);
        }
        else{
            bubble(arr, i-1, 0);
        }
    }
}
