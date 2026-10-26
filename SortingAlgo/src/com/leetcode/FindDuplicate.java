package com.leetcode;
//Q: Amazon
// 287 : https://leetcode.com/problems/find-the-duplicate-number
class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2}; //ans : 3
        System.out.println(findDuplicate(nums));
    }
    static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){

            if(nums[i] != i + 1){
                int correct = nums[i] - 1;
                // nums[i] = correct + 1;
                // num[0] = 0 + 1 = > 1
                if(nums[i] != nums[correct]){
                    swap(nums, i, correct);
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}