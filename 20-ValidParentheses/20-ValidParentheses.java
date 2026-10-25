// Last updated: 10/25/2026, 4:33:05 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st = new Stack<>();
4
5        for (int i=0; i<s.length(); i++) {
6            char ch = s.charAt(i);
7            if (ch == '{' || ch == '[' || ch == '(') {
8                st.push(ch);
9            }
10            else {
11                if (st.isEmpty()) {
12                    return false;
13                }
14                char chT = st.peek();
15                if ((chT == '(' && ch == ')') || (chT == '[' && ch == ']') || (chT == '{' && ch == '}')) {
16                    st.pop();
17                }
18                else {
19                    return false;
20                }
21                
22            }
23        }
24        return st.isEmpty() ? true : false;
25    }
26}