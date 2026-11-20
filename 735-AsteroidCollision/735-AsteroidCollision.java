// Last updated: 11/20/2026, 6:19:26 PM
1class Solution {
2    public int[] asteroidCollision(int[] ast) {
3        Stack<Integer> st = new Stack<>();
4
5        for (int i=0; i<ast.length; i++) {
6            if (ast[i]<0) {
7                while (!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(ast[i])) {
8                    st.pop();
9                }
10                if (!st.isEmpty() && st.peek() == Math.abs(ast[i])) {
11                    st.pop();
12                }
13                else if (st.isEmpty() || st.peek()<0) {
14                    st.push(ast[i]);
15                }
16            }
17            else {
18                st.push(ast[i]);
19            }
20        }
21        int n = st.size();
22        int ans[] = new int[n];
23        for (int i=n-1; i>=0; i--) {
24            ans[i] = st.pop();
25        }
26        return ans;
27    }
28}