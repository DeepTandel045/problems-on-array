//Given an array of integers nums and an integer target, find the smallest index (0 based indexing) where the target appears in the array. If the target is not found in the array, return -1
public class E8 {
        public static void main(String[] args) {
            int[] nums = {4, 2, 7, 2, 9, 5};
            int target = 9;

            int index = findFirstIndex(nums, target);
            System.out.print(index);
        }

        public static int findFirstIndex(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
            return -1;
        }
    }


