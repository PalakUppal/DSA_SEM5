// Last updated: 11/20/2026, 6:10:38 PM
1class Solution {
2    public String removeKdigits(String num, int k) {
3        Stack<Integer> st = new Stack<>();
4
5        for (int i=0; i<num.length(); i++) {
6            int nume = num.charAt(i)-'0';
7            while (!st.isEmpty() && k>0 && st.peek()>nume) {
8                st.pop();
9                k--;
10            }
11            st.push(nume);
12        }
13
14        while (k>0 && !st.isEmpty()) {
15            st.pop();
16            k--;
17        }
18        if (st.isEmpty()) return "0";
19
20        StringBuilder sb = new StringBuilder();
21        while (!st.isEmpty()) {
22            sb.append(st.pop());
23        }
24        sb.reverse();
25        
26        while (sb.length()>0 && sb.charAt(0) == '0') {
27            sb.deleteCharAt(0);
28        }
29        
30        return sb.length() == 0 ? "0" : sb.toString();
31    }
32}