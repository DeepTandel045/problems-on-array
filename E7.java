//Given an integer array nums, move all the 0's to the end of the array. The relative order of the other elements must remain the same. This must be done in place, without making a copy of the array.
public class E7 {
        public static void main(String[] args) {
            int[] nums = {0, 1, 0, 3, 12};

            moveZeroes(nums);

            for (int num : nums) {
                System.out.print(num + " ");
            }
        }

        public static void moveZeroes(int[] nums) {
            int insertPos = 0;
            for (int num : nums) {
                if (num != 0) {
                    nums[insertPos] = num;
                    insertPos++;
                }
            }
            while (insertPos < nums.length) {
                nums[insertPos] = 0;
                insertPos++;
            }
        }
    }


