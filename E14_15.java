//Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.
public class E14_15 {
    public int longestSubarrayWithSumK(int[] nums, int k) {
        int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        E14_15 sol = new E14_15();
        int[] nums = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 10;
        int result = sol.longestSubarrayWithSumK(nums, k);
        System.out.println("Length of longest subarray with sum " + k + " is: " + result);
    }
}
