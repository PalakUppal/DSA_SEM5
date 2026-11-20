// Last updated: 11/20/2026, 6:11:49 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        Stack<Integer> st = new Stack<>();
4        int n = nums.length;
5        int[] ans = new int[n];
6
7        for (int i=2*n-1; i>=0; i--) {
8            while (!st.isEmpty() && st.peek() <= nums[i%n]) {
9                st.pop();
10            }
11            if (st.isEmpty()) {
12                ans[i%n] = -1;
13            }
14            else {
15                ans[i%n] = st.peek();
16            }
17            st.push(nums[i%n]);
18        }
19        return ans;
20    }
21}