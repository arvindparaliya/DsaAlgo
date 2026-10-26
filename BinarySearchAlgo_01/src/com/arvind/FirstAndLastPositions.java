package com.arvind;

import java.util.Arrays;

public class FirstAndLastPositions {
    public static void main(String[] args) {
        //array must be in sorted
        int[] nums = {1, 2, 3, 7, 7, 7, 8, 8, 10};
        //index no.=  0, 1, 2, 3, 4, 5, 6, 7, 8
        int target = 1;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    static int[] searchRange(int[] nums, int target){

        int[] ans = {-1, -1};
        //check first occurrence if target first
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1]= end;

        return ans;

//        ans[0] = search(nums, target, true);
//        if(ans[0] != -1){
//            ans[1] = search(nums, target, false);
//        }
//        return ans;
    }
    //this function is just return the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                //potential answer found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}