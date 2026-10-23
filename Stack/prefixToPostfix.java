package Stack;

import java.util.Stack;

public class prefixToPostfix {
	public static String prefix2Postfix(String s) {
		int i = s.length() - 1;
		Stack<String> st = new Stack<>();

		while (i >= 0) {
			String ch = String.valueOf(s.charAt(i));
			if (Character.isLetterOrDigit(s.charAt(i))) {
				st.push(ch);
			} else {
				String t1 = st.pop();
				String t2 = st.pop();

				st.push(t1 + t2 + ch);
			}
			i--;
		}
		return st.pop();
	}

	public static void main(String[] args) {

		String s = "*+ABC";

		System.out.println(prefix2Postfix(s));
	}
}
