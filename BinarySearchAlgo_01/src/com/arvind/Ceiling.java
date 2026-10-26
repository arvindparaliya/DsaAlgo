package com.arvind;

public class Ceiling {
    public static void main(String[] args){
        int[] arr = {2, 3, 5, 9, 14, 16, 18, 20};
        //           0, 1, 2, 3, 4,  5,  6,  7
        int target = 88;

        int ans = ceilingSearch(arr, target);
        System.out.println(ans);
    }

    //if the array is sorted use the binary search
    //Ceiling number : finding the smallest number in array which is greater or equal to the target number
    static int ceilingSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        //if the target number is greater than the greatest number in array
        if(target > arr[end] ){
            return -1;
        }

        while(start <= end){
            int mid = start + (end - start)/2;   //mid = 3 ->(9)

            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
