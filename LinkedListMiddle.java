package LinkedList;

public class LinkedListMiddle {

	static class Node {
		int data;
		Node next;

		Node(int val) {
			data = val;
			this.next = null;
		}

	}

	public static int middleEl(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);

		System.out.println(middleEl(head));

	}

}
