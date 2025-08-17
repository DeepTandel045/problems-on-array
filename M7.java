//Given an integer array nums of even length consisting of an equal number of positive and negative integers.Return the answer array in such a way that the given conditions are met:
//
//
//
//Every consecutive pair of integers have opposite signs.
//For all integers with the same sign, the order in which they were present in nums is preserved.
//The rearranged array begins with a positive integer.
public class M7 {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int pos = 0, neg = 1;
        for (int num : nums) {
            if (num > 0) {
                result[pos] = num;
                pos += 2;
            } else {
                result[neg] = num;
                neg += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        M7 sol = new M7();
        int[] nums = {3, -2, 10, -9, 2, -4};
        int[] ans = sol.rearrangeArray(nums);
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
