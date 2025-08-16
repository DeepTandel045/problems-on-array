//Given an array nums of n integers, return true if the array nums is sorted in non-decreasing order or else false.
public class E3 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 5};

        boolean sorted = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                sorted = false;
                break;
            }
        }

        System.out.print(sorted);
    }
}
