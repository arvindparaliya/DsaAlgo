package com.arvind;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};

       int ans =  min(arr);
       System.out.println(ans);
    }
    static int min(int[] num){
        if(num.length == 0){
            return -1;
        }
        int ans = num[0];
        for (int i = 1; i < num.length ; i++) {
            if(num[i] < ans){
                ans = num[i];
            }
        }
        return ans;

//        int ans = num[0]; //assume 0th index is min
//        for (int i = 1; i < num.length; i++) {
//            if(num[i] < ans){
//                ans = num[i];
//
//            }
//        }
//        return ans;
    }
}
