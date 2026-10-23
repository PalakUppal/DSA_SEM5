package Queue;

import java.util.ArrayDeque;

public class palindromeUsingDeque {

	public static boolean palin(String s) {
		java.util.Deque<Character> dq = new ArrayDeque<>();

		for (int i = 0; i < s.length(); i++) {
			dq.addFirst(s.charAt(i));
		}

		while (dq.size() > 1) {
			if (dq.removeFirst() != dq.removeLast()) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "racecar";

		if (palin(s)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
