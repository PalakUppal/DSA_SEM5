package LinkedListDoubly;

//Q3. Reverse the Doubly Linked List
//Create a doubly linked list and reverse the list by changing the next and prev links. Do not create a new list.
public class HWReverLL {

	static class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
			prev = next = null;
		}

	}

	public static Node revereLL(Node head) {
		Node newNode = null;
		Node curr = head;

		while (curr != null) {
			Node temp = curr.prev;
			curr.prev = curr.next;
			curr.next = temp;
			newNode = curr;
			curr = curr.prev;
		}
		return newNode;
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
		Node newhead = revereLL(head);

		printForward(newhead);
	}
}
