package Stack;

import java.util.Stack;

public class prefixToInfix {

	static String preToInfix(String s) {
		int i = s.length() - 1;
		Stack<String> st = new Stack<>();

		while (i >= 0) {
			char ch = s.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				st.push(String.valueOf(ch));
			} else {
				String t1 = st.pop();
				String t2 = st.pop();

				String con = "(" + t1 + ch + t2 + ")";
				st.push(con);
			}
			i--;
		}
		return st.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
