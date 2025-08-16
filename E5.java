//Given an integer array nums, rotate the array to the left by one.
//
//
//
//Note: There is no need to return anything, just modify the given array.
public class E5 {
        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4, 5};

            rotateLeftByOne(nums);

            for (int num : nums) {
                System.out.print(num + " ");
            }
        }

        public static void rotateLeftByOne(int[] nums) {
            if (nums.length == 0) return;

            int first = nums[0];
            for (int i = 1; i < nums.length; i++) {
                nums[i - 1] = nums[i];
            }
            nums[nums.length - 1] = first;
        }
    }

