package com.solutions.leetcode.maximumsubarray;

public class MaximumSubarray {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,-3,-10}));
    }

    public static int maxSubArray(int[] nums) {
        int runningSum = nums[0];
        int largestSum = nums[0];

        for(int i=1; i<nums.length; i++) {
            if(runningSum < 0){
                runningSum = nums[i];
            } else {
                runningSum += nums[i];
            }
            largestSum = Math.max(runningSum, largestSum);
        }
        return largestSum;
    }
}
