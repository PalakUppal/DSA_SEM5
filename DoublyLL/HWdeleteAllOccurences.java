package LinkedListDoubly;

//Q2. Delete All Occurrences
//Create a doubly linked list and take a value from the user. Delete all nodes containing that value from the list.

public class HWdeleteAllOccurences {

	static class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
		}

		public static Node deleteOccurences(Node head, int value) {
			if (head == null)
				return head;

			Node temp = head;

			while (temp != null) {
				if (temp.data == value) {
					Node newNode = temp.next;
					if (newNode != null) {
						newNode.prev = temp.prev;
					}
					if (temp.prev != null) {
						temp.prev.next = newNode;
					} else {
						head = newNode;
					}
					temp = newNode;
				} else {
					temp = temp.next;
				}
			}
			return head;

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
			Node head = new Node(1);

			Node second = new Node(1);

			Node third = new Node(1);

			Node fourth = new Node(2);

			Node fifth = new Node(3);

			Node sixth = new Node(1);

			Node seventh = new Node(2);

			head.next = second;
			second.prev = head;

			second.next = third;
			third.prev = second;

			third.next = fourth;
			fourth.prev = third;

			fourth.next = fifth;
			fifth.prev = fourth;

			fifth.next = sixth;
			sixth.prev = fifth;

			sixth.next = seventh;
			seventh.prev = sixth;
			printForward(head);
			System.out.println("After");
			head = deleteOccurences(head, 1);
			printForward(head);
		}

	}
}
