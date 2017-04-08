package leetcode_88_merge_sorted_array;

/*
	Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
	
	Note:
	You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. 
	The number of elements initialized in nums1 and nums2 are m and n respectively.
 */

public class Question {
	public static void main(String args[]) {
		int[] nums1 = new int[100];
		nums1[0] = 0;
		nums1[1] = 5;
		nums1[2] = 6;
		nums1[3] = 10;
		
		int[] nums2 = {3, 4, 8, 9};
		Solution.merge(nums1, 4, nums2, 4);
		
	} 
}
