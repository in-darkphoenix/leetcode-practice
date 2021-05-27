package part1;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                list.add(nums1[i]);
                i++;
            } else {
                list.add(nums2[j]);
                j++;
            }
        }
        if (i == m) {
            while (j < n) {
                list.add(nums2[j]);
                j++;
            }
        }
        if (j == n) {
            while (i < m) {
                list.add(nums1[i]);
                i++;
            }
        }
        System.out.println(list);
    }
}
