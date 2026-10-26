package com.arvind;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        int finalAns = Wealth(accounts);
        System.out.println(finalAns);

    }
    static int Wealth(int[][] accounts){
        //person = row
        //bank = col
        int ans = Integer.MIN_VALUE;
        for(int person =  0; person < accounts.length; person++){
            int sum = 0;
            for (int bank = 0; bank < accounts[person].length; bank++) {
                sum +=accounts[person][bank];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;

    }

}

