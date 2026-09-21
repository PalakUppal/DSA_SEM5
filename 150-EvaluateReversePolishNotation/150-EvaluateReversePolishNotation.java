// Last updated: 9/21/2026, 4:58:53 PM
1class Solution {
2    public String simplifyPath(String path) {
3        Stack<String> st = new Stack<>();
4        String[] pt = path.split("/");
5        for (String p : pt) {
6            if (p.equals("") || p.equals(".")) {
7                continue;
8            }
9            if (p.equals("..")) {
10                if (!st.isEmpty()) {
11                    st.pop();
12                }
13            }
14            else {
15                st.push(p);
16            }
17        }
18        StringBuilder res = new StringBuilder();
19        for (String f : st) {
20            res.append("/");
21            res.append(f);
22        }
23
24        if (res.length() == 0) {
25            return "/";
26        }
27        return res.toString();
28    }
29}