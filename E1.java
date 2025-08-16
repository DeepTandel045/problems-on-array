//Given an array of integers nums, return the value of the largest element in the array
public class E1 {
    public static void main(String[] args) {
        int[] nums = {5, 12, 7, 3, 19, 1};

        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        System.out.print(largest);
    }
}
