package com.arvind;

import java.util.Arrays;

public class Exists{
    public static void main(String [] args){
        //Q :Is the target number exists or not ?
        int [] nums = {12, 22, 33, 19, 993, 55};
        int target = 19;
//        int ans = linearSearch(nums, target);//since argumentative function is defined so we have to pass the value in arguments
//        System.out.println(ans);
        boolean ans = linearSearch2(nums, target);
        System.out.println(ans);

    }
    static boolean linearSearch2(int [] arr, int target){
        if(arr.length == 0){
            return true;
        }
        for (int element : arr) {
            if(target == element){
                return true;
            }
        }
        return false;
    }


    //argument type function or method
    static int linearSearch(int [] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length ; index++) {
            if(target == arr[index]){
                return index;
            }
        }
        return -1;
    }
}