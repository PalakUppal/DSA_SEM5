// Last updated: 7/24/2026, 6:02:06 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int low = 0;
4		int high = nums.length - 1;
5
6		while (low <= high) {
7			int mid = (low + high) / 2;
8			if (nums[mid] == target)
9				return mid;
10			else if (target > nums[mid])
11				low = mid + 1;
12			else
13				high = mid - 1;
14		}
15		return -1;
16    }
17}