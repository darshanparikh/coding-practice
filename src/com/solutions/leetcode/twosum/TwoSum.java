package com.solutions.leetcode.twosum;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Solution for LeetCode Problem - Two Sum
 * @see <a href="https://leetcode.com/problems/two-sum/">Problem Statement</a>
 * <a href="https://leetcode.com/submissions/detail/614055246/">Solution Performance</a>
 * @author Darshan Parikh, darshan1191@gmail.com
 */
public class TwoSum {

    public static void main(String[] args) {
        // call the optimized solution
        printArray(twoSums(new int[]{3, 2, 4}, 6));
    }

    public static void printArray(int[] array) {
        Objects.requireNonNull(array);
        for(int num: array) {
            System.out.print(num+" ");
        }
        System.out.println();
    }

    // brute force solution - O(n^2)
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        //use two pointers to find a pair summing up to target
        for(int i=0; i<nums.length - 1; i++) {
            for(int j=i+1; j<nums.length; j++){
                if (target == nums[i] + nums[j]) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    /*
     * Assuming int type having good hashCode implementation generating unique codes
     * for different values, Map should have constant time put, containsKey and
     * get calls - making it a linear solution O(n)
     */
    public static int[] twoSums(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        // prepare a Map(key -> element value, value -> element index ) even when array might
        // have duplicates having key pointing to the element index of that duplicate. This works
        // as there is only one solution present it the provided array
        for(int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }

        // iterate over the array and with each pass find a matching index value from Map
        // resulting into required target
        for(int i = 0; i < nums.length; i++) {
            // discard entry when loop index and target element index from Map are same
            // as we can't use the same element twice
            if(numsMap.containsKey(target - nums[i]) && i != numsMap.get(target - nums[i])) {
                return new int[] {i, numsMap.get(target - nums[i])};
            }
        }
        return null;
    }
}
