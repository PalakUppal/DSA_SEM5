// Last updated: 11/20/2026, 6:17:08 PM
1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        int n = temperatures.length;
4        int[] ans = new int[n];
5        Stack<Integer> st = new Stack<>();
6
7        for (int i=0; i<n; i++) {
8            while (!st.isEmpty() && temperatures[i]>temperatures[st.peek()]) {
9                int pDay = st.pop();
10                ans[pDay] = i-pDay;
11            } 
12            st.push(i);
13        }
14
15        return ans;
16    }
17}