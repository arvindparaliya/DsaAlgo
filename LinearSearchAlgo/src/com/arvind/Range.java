package com.arvind;

public class Range {
    public static void main(String [] args){

        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;

//        int ans = searchR(arr, target);
//        System.out.println("target is found at index number : " + ans);

        int ans = linearSearch(arr, target, 1, 4);
        System.out.println(ans);
    }

    static int linearSearch(int[] num, int target, int start, int end){
        if(num.length == 0){
            return -1;
        }
        for (int i = start; i < end ; i++) {
            if(num[i] == target){
                return i;
            }
        }
        return -1;
    }




//    static int searchR(int[] num, int target){
//        if(num.length == 0){
//            return -1;
//        }
//        for (int i = 1; i < 5 ; i++) {
//            if(num[i] == target){
//                return i;
//            }
//        }
//        return -1;
//    }
}

