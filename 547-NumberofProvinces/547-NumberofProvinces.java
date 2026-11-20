// Last updated: 11/20/2026, 5:27:32 PM
1class Solution {
2    static void dfs(int city, int[][] isConnected, boolean[] visited) {
3        visited[city] = true;
4
5        for (int n=0; n<isConnected.length; n++) {
6            if (isConnected[city][n] == 1 && !visited[n]) {
7                dfs(n, isConnected, visited);
8            }
9        }
10    }
11    public int findCircleNum(int[][] isConnected) {
12        int n = isConnected.length;
13        boolean[] visited = new boolean[n];
14        int p = 0;
15        for (int i=0; i<n; i++) {
16            if (!visited[i]) {
17                p++;
18                dfs(i, isConnected, visited);
19            }
20        }
21        return p;
22    }
23}