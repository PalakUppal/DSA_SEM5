// Last updated: 7/27/2026, 5:34:50 PM
1class Solution {
2    private int Foccur (int[] nums, int target) {
3        int l = 0;
4        int r = nums.length-1;
5        int ans = -1;
6        while (l<=r) {
7            int mid = l+(r-l)/2;
8            if (nums[mid] == target) {
9                ans = mid;
10                r = mid-1;
11            }
12            else if (target > nums[mid]) {
13                l = mid+1;
14            }
15            else {
16                r = mid-1;
17            }
18        }
19        return ans;
20    }
21
22    private int Loccur (int[] nums, int target) {
23        int l = 0;
24        int r = nums.length-1;
25        int ans = -1;
26        while (l<=r) {
27            int mid = l+(r-l)/2;
28            if (nums[mid] == target) {
29                ans = mid;
30                l = mid+1;
31            }
32            else if (target > nums[mid]) {
33                l = mid+1;
34            }
35            else {
36                r = mid-1;
37            }
38        }
39        return ans;
40        
41    }
42    public int[] searchRange(int[] nums, int target) {
43        int a1 = Foccur(nums, target);
44        int a2 = Loccur(nums, target);
45
46        return new int[]{a1, a2};
47    }
48}