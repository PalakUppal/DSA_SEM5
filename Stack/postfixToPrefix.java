package Stack;

import java.util.Stack;

public class postfixToPrefix {

	public static String postfix2Prefix(String s) {
		int i = 0;
		Stack<String> st = new Stack<>();

		while (i < s.length()) {
			char ch = s.charAt(i);

			if (Character.isLetterOrDigit(ch)) {
				st.push(String.valueOf(ch));
			} else {
				String t1 = st.pop();
				String t2 = st.pop();

				st.push(String.valueOf(ch) + t2 + t1);
			}
			i++;
		}
		return st.pop();
	}

	public static void main(String[] args) {

		String s = "AB+C*";

		System.out.println(postfix2Prefix(s));
	}
}
