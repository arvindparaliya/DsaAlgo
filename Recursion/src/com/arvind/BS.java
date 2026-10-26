package com.arvind;

import java.util.Arrays;

public class BS {
    public static void main(String[] args){
        int[] arr = {2, 4, 5, 66, 76, 87, 88, 90};
                  // 0, 1, 2,  3,  4,  5,  6,  7
        int target = 90;
        int ans = search(arr, target, 0 , arr.length-1);
        System.out.println(ans);
    }
    static int search(int[] arr, int target, int start, int end){

        //base condition
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;

        if(arr[mid] == target){
            return mid;
        }
        return search(arr, target, mid + 1, end);
    }
}
