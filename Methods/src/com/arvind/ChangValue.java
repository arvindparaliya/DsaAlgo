package com.arvind;

import java.util.Arrays;

public class ChangValue {
    public static void main(String[] args) {

        //create an array
        int [] arr = {1, 2, 3, 4, 5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int [] num){
        num[0] = 99;
        //if you make a change to the object via this variable, same object will  change
    }
}
