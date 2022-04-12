package com.solutions.leetcode.excelcolumnnum;

/**
 * Solution for LeetCode Problem - Excel Sheet Column Number
 * @see <a href="https://leetcode.com/problems/excel-sheet-column-number/">Problem Statement</a>
 * <a href="https://leetcode.com/submissions/detail/678641475/">Solution Performance</a>
 * @author Darshan Parikh, darshan1191@gmail.com
 */
public class ExcelColumnNum {

    public static void main(String[] args) {
        System.out.println(titleToNumber("FXSHRXW"));
    }

    public static int titleToNumber(String columnTitle) {
        int num = 0;

        for(char c: columnTitle.toCharArray()) {
            num = (26 * num) + (c - 64);
        }
        return num;
    }
}
