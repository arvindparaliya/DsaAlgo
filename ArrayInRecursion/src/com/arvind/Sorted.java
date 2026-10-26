package com.arvind;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {2, 14, 5, 7, 9};
        System.out.println(isSorted(arr, 0));
    }
    static boolean isSorted(int[] arr, int idx){

        //base condition
        if(idx == arr.length - 1){
            return true;
        }
        //recurrence relation
        return arr[idx] < arr[idx + 1] && isSorted(arr, idx + 1);
    }
}
