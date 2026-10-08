package Queue;

import java.util.LinkedList;

public class MovingAverage {

	Queue<Integer> q;
	int size;

	public MovingAverage(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		q = new LinkedList<>();
	}

	double next(int value) {
		q.add(value);
		if (q.size() > size) {
			q.poll();
		}
		int sum = 0;
		for (int num : q) {
			sum += num;
		}
		return (double) sum / q.size();
	}

	public static void main(String[] args) {
		MovingAverage obj = new MovingAverage(3);
		System.out.println(obj.next(1));
		System.out.println(obj.next(10));
		System.out.println(obj.next(3));
		System.out.println(obj.next(5));
		// System.out.println("Try clicking the Run button.");
	}

}
