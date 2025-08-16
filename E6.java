//Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.
public class E6 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateLeft(nums, k);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void rotateLeft(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;
        k = k % n;

        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
