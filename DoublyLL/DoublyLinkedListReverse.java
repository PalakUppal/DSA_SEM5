package LinkedListDoubly;

public class DoublyLinkedListReverse {

	static class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
		}
	}

	static void printBackward(Node head) {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.prev;
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
		printBackward(head);

	}
}
