package Queue;

import java.util.Collections;

public class hospitalManagementUsingPQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>(Collections.reverseOrder());
		int[] arr = { 15, 23, 100, 1, 45 };

		for (int x : arr) {
			pq.add(x);
		}

		System.out.println("Highest Priority Case: " + pq.poll());
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

}
