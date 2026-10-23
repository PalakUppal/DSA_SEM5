package Queue;

public class PriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();

		pq.add(10);
		pq.add(30);
		pq.add(20);

		System.out.println(pq.peek());
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

}
