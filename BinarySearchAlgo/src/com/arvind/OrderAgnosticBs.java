package com.arvind;

public class OrderAgnosticBs {
    public static void main(String[] args){
        // OrderAgnostic algorithms for that when we don't know whether the given array is sorted or not

        int[] arr = {-4, -1, 0, 33, 44, 55, 66, 67, 90, 91};
        int target = 0;

        int ans = odeAgnBS(arr, target);
        System.out.println(ans);
    }

    static int odeAgnBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        //find whether the array is sorted in ascending or descending
        boolean isAscending = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            //best case for binary search time-complexity is O(1)
            if(arr[mid] == target){
                return mid;
            }

            //time-complexity is log2(N)
            //array is sorted in ascending order
            if(isAscending){
                if(target < arr[mid]){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
            else {
                //array is sorted in descending order
                if(target > arr[mid]){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }

        }
        return -1;
    }

}
