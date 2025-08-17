//Given an array of integers nums and an integer target. Return the indices(0 - indexed) of two elements in nums such that they add up to target.
//
//
//
//Each input will have exactly one solution, and the same element cannot be used twice. Return the answer in increasing order.
public class M1 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        M1 sol = new M1();
        int[] nums = {2, 7, 3, 15};
        int target = 10;
        int[] ans = sol.twoSum(nums, target);
        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }
}
