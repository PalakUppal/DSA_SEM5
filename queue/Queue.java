package Queue;

public class Queue {
	int[] arr;
	int front;
	int rear;
	int size;

	Queue(int size) {
		this.size = size;
		arr = new int[size];
		front = -1;
		rear = -1;
	}

	void enqueue(int value) {
		if (rear == size - 1) {
			System.out.println("Queue Overflow");
			return;
		}

		if (front == -1) {
			front = 0;
		}
		rear++;
		arr[rear] = value;
		System.out.println(value + " Inserted");
	}

	void dequeue() {
		if (front == -1 || front > rear) {
			System.out.println("Queue Underflow");
			return;
		}
		System.out.println(arr[front] + " Removed");
		front++;
	}

	void peek() {
		if (front == -1 || front > rear) {
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println("Front Element: " + arr[front]);
	}

	void display() {
		if (front == -1 || front > rear) {
			System.out.println("Queue is Empty");
			return;
		}
		for (int i = front; i <= rear; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.display();
	}

}
