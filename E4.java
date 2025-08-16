//Given an integer array nums sorted in non-decreasing order, remove all duplicates in-place so that each unique element appears only once. Return the number of unique elements in the array.
//
//
//
//If the number of unique elements be k, then,
//
//Change the array nums such that the first k elements of nums contain the unique values in the order that they were present originally.
//The remaining elements, as well as the size of the array does not matter in terms of correctness.
//
//
//An array sorted in non-decreasing order is an array where every element to the right of an element is either equal to or greater in value than that element.

public class E4 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int k = removeDuplicates(nums);

        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
