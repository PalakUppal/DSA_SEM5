package Queue;

import java.util.ArrayDeque;

public class reverseUsingDeque {
	public static void main(String[] args) {
		String s = "Hello";
		java.util.Deque<Character> dq = new ArrayDeque<>();

		for (int i = 0; i < s.length(); i++) {
			dq.addFirst(s.charAt(i));
		}

		StringBuilder sb = new StringBuilder();
		while (!dq.isEmpty()) {
			sb.append(dq.removeFirst());
		}
		System.out.println("Original " + s);
		System.out.println("Reversed " + sb.toString());

	}

}
