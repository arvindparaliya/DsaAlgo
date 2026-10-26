package com.leetcode;

class MissingNumber {
    public static void main(String[] args){
        int[] nums = {9, 3, 2, 1, 4, 5, 0, 7};

        int ans = missingNumber(nums);
        System.out.println(ans);
    }

    static int missingNumber(int[] nums) {
        //cyclic sort algo
        //here the range is [0, n] means total number = n + 1
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        //search for missing number
        for(int idx = 0; idx < nums.length; idx++){
            if(nums[idx] != idx){
                return idx;
            }
        }
        //if out missing number is last n
        return nums.length;

    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}