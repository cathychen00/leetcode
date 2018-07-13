package com.cathy.leetcode;

public class _2_MaxProfit {
    public static int maxProfit(int[] nums){
        if(nums==null||nums.length<=1){
            return 0;
        }
        int profit=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]>0){
                profit+=nums[i+1]-nums[i];
            }
        }
        return profit;
    }
}
