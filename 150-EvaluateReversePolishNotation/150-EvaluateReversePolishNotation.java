// Last updated: 9/21/2026, 7:21:47 PM
1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer> cSt = new Stack<>();
4        Stack<String> st = new Stack<>();
5
6        String cString = "";
7        int cNumber = 0;
8        for (char ch : s.toCharArray()) {
9            if (Character.isDigit(ch)) {
10                cNumber = cNumber*10 + (ch-'0');
11            }
12            else if (ch == '[') {
13                cSt.push(cNumber);
14                st.push(cString);
15                cNumber = 0;
16                cString = "";
17            }
18            else if (ch == ']') {
19                int c = cSt.pop();
20                String pString = st.pop();
21                StringBuilder temp = new StringBuilder();
22
23                for (int i=0; i<c; i++) {
24                    temp.append(cString);
25                }
26                cString = pString+temp.toString();
27            }
28            else {
29                cString += ch;
30            }
31        }
32        return cString;
33    }
34}