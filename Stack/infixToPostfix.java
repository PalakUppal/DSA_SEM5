package Stack;

import java.util.Stack;

public class infixToPostfix {
	static int priority(char ch) {
		if (ch == '^')
			return 3;
		if (ch == '*' || ch == '/')
			return 2;
		if (ch == '+' || ch == '-')
			return 1;
		return 0;
	}

	static String infixToPostfix(String s) {
		StringBuilder ans = new StringBuilder();
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				ans.append(ch);
			}

			else if (ch == '(') {
				st.push(ch);
			}

			else if (ch == ')') {
				while (!st.isEmpty() && st.peek() != '(') {
					ans.append(st.pop());
				}
				st.pop();
			}

			else {
				if (ch == '^') {
					while (!st.isEmpty() && priority(ch) < priority(st.peek())) {
						ans.append(st.pop());
					}
				} else {
					while (!st.isEmpty() && priority(ch) <= priority(st.peek())) {
						ans.append(st.pop());
					}
				}
				st.push(ch);
			}
		}

		while (!st.isEmpty()) {
			ans.append(st.pop());
		}
		return ans.toString();
	}

	public static void main(String[] args) {

		String s = "A+B*C";

		String ans = infixToPostfix(s);

		System.out.println(ans);
	}
}
