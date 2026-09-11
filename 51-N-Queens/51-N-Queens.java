// Last updated: 9/11/2026, 9:38:44 PM
1class Solution {
2    public List<List<String>> solveNQueens(int n) {
3        List<List<String>> ans = new ArrayList<>();
4        char[][] board = new char[n][n];
5
6        for (int i=0; i<n; i++) {
7            Arrays.fill(board[i], '.');
8        }
9
10        solve(0, board, ans, n);
11        return ans;
12    }
13
14    private void solve(int col, char[][] board, List<List<String>> ans, int n) {
15        if (col == n) {
16            List<String> list = new ArrayList<>();
17            for (int i=0; i<n; i++) {
18                list.add(new String(board[i]));
19            }
20            ans.add(list);
21            return;
22        }
23
24        for (int row=0; row<n; row++) {
25            if (isSafe(row, col, board, n)) {
26                board[row][col] = 'Q';
27                solve(col+1, board, ans, n);
28                board[row][col] = '.';
29            }
30        }
31    }
32
33    private boolean isSafe(int row, int col, char[][] board, int n) {
34        int duprow = row;
35        int dupcol = col;
36
37        while (row>=0 && col>=0) {
38            if (board[row][col] == 'Q') return false;
39            col--; row--;
40        }
41
42        row = duprow;
43        col = dupcol;
44
45        while (col>=0) {
46            if (board[row][col] == 'Q') return false;
47            col--;
48        }
49
50        row = duprow;
51        col = dupcol;
52        while (row<n && col>=0) {
53            if (board[row][col] == 'Q') return false;
54            col--; row++;
55        }
56
57        return true;
58
59    }
60}