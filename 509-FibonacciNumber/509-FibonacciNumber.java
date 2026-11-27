// Last updated: 11/27/2026, 6:06:54 PM
1class Solution {
2    public int fib(int n) {
3        int[] dp = new int[n+1];
4        Arrays.fill(dp, -1);
5        return solve(n, dp);
6    }
7
8    public int solve(int n, int[] dp) {
9        if (n<=1) return n;
10        if (dp[n] != -1) return dp[n];
11        dp[n] = solve(n-1, dp) + solve(n-2, dp);
12        return dp[n];
13    } 
14}