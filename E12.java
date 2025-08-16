//Given a binary array nums, return the maximum number of consecutive 1s in the array.
//
//
//
//A binary array is an array that contains only 0s and 1s.
import java.util.*;

public class E12 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        E12 sol = new E12();
        int[] nums = {1, 1, 0, 1, 1, 1}; // Example input
        int result = sol.findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive 1s: " + result);
    }
}
