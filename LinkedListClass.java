package LinkedList;

public class LinkedListClass {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void printList(Node head) {
		Node tempNode = head;
		while (tempNode != null) {
			System.out.println(tempNode.data + " ");
			tempNode = tempNode.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		printList(head);
	}

}
