package LinkedListDoubly;

public class InsertBeginingDoublyLinkedList {

	static class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
		}
	}

	static Node IAB(Node head, int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		if (head != null) {
			head.prev = newNode;
		}
		head = newNode;
		return head;
	}

	static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		head.next = second;
		second.prev = head;
		second.next = third;
		third.prev = second;
		third.next = fourth;
		fourth.prev = third;
		Node newHead = IAB(head, 5);
		printList(newHead);

	}

}
