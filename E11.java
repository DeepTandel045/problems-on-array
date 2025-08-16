//Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), return the only number missing from the array within this range.

import java.util.*;

public class E11 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        E11 sol = new E11();
        int[] nums = {3, 0, 1 , 5 , 2}; // Example input
        int missing = sol.missingNumber(nums);
        System.out.println("Missing number: " + missing);
    }
}
