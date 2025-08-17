//Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order. The sorting must be done in-place, without making a copy of the original array.

import java.util.Arrays;

public class M2 {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }

    public static void main(String[] args) {
        M2 sol = new M2();
        int[] nums = {2, 0, 2, 1, 1, 0};
        sol.sortColors(nums);
        for (int x : nums) {
            System.out.print(x + " ");
        }
    }
}
