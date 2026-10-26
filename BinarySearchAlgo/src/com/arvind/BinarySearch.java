package com.arvind;

public class BinarySearch{
    public static void main(String[] args) {
        //assume that array is sorted
        int[] arr = {-19, -13, -11, -9, -1, 0, 2, 33,44, 56, 88, 98, 100};
        int target = 1900;

//        System.out.println(arr.length);
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    //find the target value's index
    //if number is not exists then return -1
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            //int mid = (start + end)/2; //it might be exceeded when out number is very large
            //so for that we cannot use above simple average(mid) formula for finding avg instead we use the given formula for true for all kinds or numbers
            int mid = start + (end - start)/2; //best way to find min(mid) value
            if(target < arr[mid]){
                end = mid - 1; //we don't need the min value or right value which those right side of min
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}