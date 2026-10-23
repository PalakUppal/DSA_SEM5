package Stack;

import java.util.Stack;

public class infixToPrefix {

	public static int priority(char ch) {
		if (ch == '^')
			return 3;
		if (ch == '*' || ch == '/')
			return 2;
		if (ch == '+' || ch == '-')
			return 1;
		return 0;
	}

	public static String infixToPrefix(String s) {
		Stack<Character> st = new Stack<>();
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();

		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '(') {
				sb.setCharAt(i, ')');
			} else if (sb.charAt(i) == ')') {
				sb.setCharAt(i, '(');
			}
		}

		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				ans.append(ch);
			} else if (ch == '(') {
				st.push(ch);
			} else if (ch == ')') {
				while (!st.isEmpty() && st.peek() != '(') {
					ans.append(st.pop());
				}
				st.pop();
			} else {
				if (ch == '^') {
					while (!st.isEmpty() && priority(ch) <= priority(st.peek())) {
						ans.append(st.pop());
					}
				} else {
					while (!st.isEmpty() && priority(ch) < priority(st.peek())) {
						ans.append(st.pop());
					}
				}
				st.push(ch);
			}
		}

		while (!st.isEmpty()) {
			ans.append(st.pop());
		}

		ans.reverse();
		return ans.toString();
	}

	public static void main(String[] args) {

		String s = "A+B*C";

		String ans = infixToPrefix(s);

		System.out.println(ans);
	}
}
