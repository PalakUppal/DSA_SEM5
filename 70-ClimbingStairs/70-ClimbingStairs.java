// Last updated: 8/10/2026, 2:35:27 PM
1class Solution {
2    public int climbStairs(int n) {
3        if (n==1) return 1;
4        if (n==2) return 2;
5
6        int first_num = 1;
7        int second_num = 2;
8
9        for (int i=3; i<=n; i++) {
10            int curr = first_num+second_num;
11            first_num = second_num;
12            second_num = curr;
13        }
14        return second_num;
15    }
16}
17