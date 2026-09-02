package LinkedListDoubly;

public class ReverseDoublyLinkedList {

	static class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
		}
	}

	static Node reverse(Node head) {
		Node curr = head;
		Node newNode = null;

		while (curr != null) {
			Node temp = curr.prev;
			curr.prev = curr.next;
			curr.next = temp;
			newNode = curr;
			curr = curr.prev;
		}
		return newNode;
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
//		Node newhead = DAB(head);
		printList(newhead);
	}
}
