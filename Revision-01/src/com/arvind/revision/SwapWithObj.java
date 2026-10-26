package com.arvind.revision;

import java.util.Arrays;

public class SwapWithObj {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4};
        System.out.println("Before changing the value of oth index :"+ Arrays.toString(arr));
        swap(arr);
        System.out.println("After changing the value of oth index :"+ Arrays.toString(arr));
        //Modify the object through the reference, it will affect the original object
    }
    //pass the reference variable inside the function
    static void swap(int[] nums){
        nums[0] = 99;

    }
}
