package Stack;

import java.util.Stack;

public class postfixToInfix {
	static String postToInfix(String s) {
		int i = 0;
		Stack<String> st = new Stack<>();

		while (i < s.length()) {
			char ch = s.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				st.push(String.valueOf(ch));
			} else {
				String t1 = st.pop();
				String t2 = st.pop();

				String con = "(" + t2 + ch + t1 + ")";
				st.push(con);
			}
			i++;
		}
		return st.pop();
	}
}
