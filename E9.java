//Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays. The elements in the union must be in ascending order.
//
//
//
//The union of two arrays is an array where all values are distinct and are present in either the first array, the second array, or both.
import java.util.*;

public class E9 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4, 5};
        int[] nums2 = {2, 3, 5, 6};

        int[] result = unionArrays(nums1, nums2);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] unionArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                addIfNotDuplicate(list, nums1[i]);
                i++; j++;
            } else if (nums1[i] < nums2[j]) {
                addIfNotDuplicate(list, nums1[i]);
                i++;
            } else {
                addIfNotDuplicate(list, nums2[j]);
                j++;
            }
        }

        while (i < nums1.length) {
            addIfNotDuplicate(list, nums1[i]);
            i++;
        }

        while (j < nums2.length) {
            addIfNotDuplicate(list, nums2[j]);
            j++;
        }

        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        return result;
    }

    private static void addIfNotDuplicate(List<Integer> list, int num) {
        if (list.isEmpty() || list.get(list.size() - 1) != num) {
            list.add(num);
        }
    }
}

