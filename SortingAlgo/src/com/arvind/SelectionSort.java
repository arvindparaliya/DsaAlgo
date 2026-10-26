package com.arvind;

import java.util.Arrays;
//select the element and put into the right position
//let's take a example of: int[] arr = {4, 5, 1, 2, 3};
//after select the greatest element in the array and swap it like, here in the case swap 5 and 3
//after swapping the element it looks like this -> 4, 3, 1, 2, 5

//Time Complexity :
//For best case => O(n2)
//For worst case => O(N2)
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
           //find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);

            //swap maxIndex with the last index
            swap(arr, maxIndex, last);
        }
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        //assume out start index is maximum
        int max = start;

        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
