//Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.
public class E2 {
    public static void main(String[] args) {
        int[] nums = {5, 12, 7, 3, 19, 1};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.print(-1);
        } else {
            System.out.print(secondLargest);
        }
    }
}

