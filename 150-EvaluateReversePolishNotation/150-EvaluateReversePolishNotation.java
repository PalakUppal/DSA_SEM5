// Last updated: 9/21/2026, 4:38:23 PM
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<Integer> st = new Stack<>();
4
5        for (String token : tokens) {
6            if (token.equals("*") || token.equals("+") || token.equals("/") || token.equals("-")) {
7                int b = st.pop();
8                int a = st.pop();
9                int res = 0;
10                if (token.equals("+")) {
11                    res = a+b;
12                }
13                else if (token.equals("-")) {
14                    res = a-b;
15                }
16                else if (token.equals("*")) {
17                    res = a*b;
18                }
19                else {
20                    res = a/b;
21                }
22                st.push(res);
23            }
24            else {
25                st.push(Integer.parseInt(token));
26            }
27
28        }
29        return st.pop();
30    }
31}