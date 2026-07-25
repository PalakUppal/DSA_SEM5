// Last updated: 7/25/2026, 11:17:05 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int l = 0;
4        int r = nums.length-1;
5
6        while (l<=r) {
7            int mid = l + (r-l)/2;
8            if (nums[mid] == target) return mid;
9
10            else if (nums[l] <= nums[mid]) { 
11                if (target >= nums[l] && target <= nums[mid])
12                    r = mid-1;
13                else 
14                    l = mid+1;
15            }
16            else {
17                if (target <= nums[r] && target >= nums[mid])
18                    l = mid+1;
19                else 
20                    r = mid-1;
21            }
22        }
23        return -1;
24    }
25}