package Queue;

public class circularqueue {
	int[] arr;
	int front, rear, size, capacity;

	public circularqueue(int capacity) {
		// TODO Auto-generated constructor stub
		this.capacity = capacity;
		arr = new int[capacity];
		front = 0;
		rear = -1;
		size = 0;
	}

	void enqueue(int value) {
		if (size == capacity) {
			System.out.println("Queue is Full");
			return;
		}

		rear = (rear + 1) % capacity;
		arr[rear] = value;
		size++;
		System.out.println("Inserted: " + value);
	}

	void dequeue() {
		if (size == 0) {
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println("Removed: " + arr[front]);
		front = (front + 1) % capacity;
		size--;
	}

	void display() {
		if (size == 0) {
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println("Queue");

		for (int i = 0; i < size; i++) {
			int ind = (front + i) % capacity;
			System.out.print(arr[ind] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
//       next index = (current index + 1) mod n
		circularqueue q = new circularqueue(5);
		q.enqueue(10);
//		q.enqueue(20);
//		q.enqueue(30);
//		q.enqueue(40);
//		q.enqueue(50);
		q.display();
		q.dequeue();
		q.enqueue(20);
		q.enqueue(30);
		q.display();

	}

}
