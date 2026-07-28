// Last updated: 7/28/2026, 11:18:19 AM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int i = 0, j = 0;
4        int k = 0;
5        int[] nums = new int[m+n];
6        while (i<m && j<n) {
7            if (nums1[i] < nums2[j]) {
8                nums[k++] = nums1[i];
9                i++;
10            } 
11            else {
12                nums[k++] = nums2[j];
13                j++;
14            }
15        }
16
17        while (i<m) {
18            nums[k++] = nums1[i++];
19        }
20        while (j<n) {
21            nums[k++] = nums2[j++];
22        }
23
24        for (int x = 0; x < m + n; x++) {
25            nums1[x] = nums[x];
26        }
27    }
28}