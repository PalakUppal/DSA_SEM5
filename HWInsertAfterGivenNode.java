package LinkedListDoubly;
//Doubly Linked List - Homework

//Q1. Insert After a Given Node
//Create a doubly linked list and take two values from the user: key and value.
//Insert the new node after the node containing key.

public class HWInsertAfterGivenNode {

	static class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
		}
	}

	public static void InsertAfterGivenNode(Node head, int key, int value) {
		if (head == null)
			return;

		Node temp = head;
		Node newNode = new Node(value);

		while (temp != null) {
			if (temp.data == key) {
				Node after = temp.next;
				temp.next = newNode;
				newNode.next = after;
				newNode.prev = temp;
				if (after != null) {
					after.prev = newNode;
				}
				return;
			}
			temp = temp.next;
		}
	}

	static void printForward(Node head) {
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
		printForward(head);
		System.out.println("After");
		InsertAfterGivenNode(head, 40, 90);
		printForward(head);
	}
}
