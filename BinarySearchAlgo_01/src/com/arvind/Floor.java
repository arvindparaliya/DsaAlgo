package com.arvind;

public class Floor {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 9, 14, 16, 18, 20};
        //           0, 1, 2, 3, 4,  5,  6,  7
        int target = 16; //ans should be less than or equals to 8; => 5 at index number 2
        int ans = floorNumber(arr, target);
        System.out.println(ans);
    }
    //Floor number : the greatest number in the array which is smallest or equal to the target number

    static int floorNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        if(target < arr[start]){
            return -1;
        }

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }

        }
        return end;
    }
}

