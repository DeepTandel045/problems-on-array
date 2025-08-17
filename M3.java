//Given an integer array nums of size n, return the majority element of the array.
//
//
//
//The majority element of an array is an element that appears more than n/2 times in the array. The array is guaranteed to have a majority element.
public class M3 {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        M3 sol = new M3();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(sol.majorityElement(nums));
    }
}
