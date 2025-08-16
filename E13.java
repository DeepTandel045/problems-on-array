//Given an array of nums of n integers. Every integer in the array appears twice except one integer. Find the number that appeared once in the array.
import java.util.*;

public class E13 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        E13 sol = new E13();
        int[] nums = {4, 1, 2, 4, 2}; // Example input
        int result = sol.singleNumber(nums);
        System.out.println("The single number is: " + result);
    }
}

