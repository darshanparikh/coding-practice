package com.solutions.leetcode.arrayproductsign;

/**
 * Solution for LeetCode Problem - Sign of the Product of an Array
 * @see <a href="https://leetcode.com/problems/sign-of-the-product-of-an-array/">Problem Statement</a>
 * <a href="https://leetcode.com/submissions/detail/677408048/">Solution Performance</a>
 * @author Darshan Parikh, darshan1191@gmail.com
 */
public class ArrayProductSign {

    public static void main(String[] args) {
        System.out.println(getArrayProductSign(new int[]{-1,-2,-3,-4,3,2,1}));
    }

    /*
     * linear time O(n) solution
     */
    public static int getArrayProductSign(int[] nums) {
        int negativeCounter = 0;
        for(int num: nums) {
            if(num == 0)
                return 0;
            if(num < 0)
                negativeCounter++;
        }

        // Bitwise AND operation to decide even/odd
        if((negativeCounter & 1) == 0)
            return 1;
        else
            return -1;
    }
}
