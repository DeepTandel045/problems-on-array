//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.


public class M14 {
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
        M14 sol = new M14();
        int[] nums = {1, 1, 0, 1, 1, 1}; // Example input
        int result = sol.findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive 1s: " + result);
    }
}
