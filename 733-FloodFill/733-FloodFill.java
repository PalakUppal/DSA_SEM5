// Last updated: 11/20/2026, 5:24:28 PM
1class Solution {
2    static void dfs(int[][] image, int row, int col, int oc, int nc) {
3        int rows = image.length;
4        int cols = image[0].length;
5
6        if (row < 0 || col < 0 || row>=rows || col>=cols) return;
7
8        if (image[row][col] != oc) return;
9        image[row][col] = nc;
10        dfs(image, row-1, col, oc, nc);
11        dfs(image, row+1, col, oc, nc);
12        dfs(image, row, col-1, oc, nc);
13        dfs(image, row, col+1, oc, nc);
14    }
15
16    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
17        int oc = image[sr][sc];
18        if (oc == color) return image;
19        dfs(image, sr, sc, oc, color);
20        return image;
21    }
22}