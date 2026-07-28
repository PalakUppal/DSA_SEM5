// Last updated: 7/28/2026, 11:06:37 AM
1class Solution {
2    public void sortColors(int[] nums) {
3        int n = nums.length;
4
5        for (int i=0; i<n-1; i++) {
6            for (int j=0; j<n-i-1; j++) {
7                if (nums[j] > nums[j+1]) {
8                    int temp = nums[j];
9                    nums[j] = nums[j+1];
10                    nums[j+1] = temp;
11                }
12            }
13        }
14    }
15}