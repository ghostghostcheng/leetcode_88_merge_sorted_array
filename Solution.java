package leetcode_88_merge_sorted_array;

public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int totalIdx = m + n - 1;
        
        while (totalIdx > -1) {
            if (n == 0) {
                break;
            } else if (m == 0) {
                nums1[totalIdx] = nums2[n - 1];
                n--;
                totalIdx--;
                continue;
            }
            
            if (nums1[m - 1] < nums2[n - 1]) {
                nums1[totalIdx] = nums2[n - 1];
                n--;
            } else {
                nums1[totalIdx] = nums1[m - 1];
                m--;
            }
            
            totalIdx--;
        }
    }
}