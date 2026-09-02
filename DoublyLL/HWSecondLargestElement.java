package LinkedListDoubly;

//Q4. Find the Second Largest Element
//Create a doubly linked list and find the second largest element without sorting the list.

public class HWSecondLargestElement {

	static class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
			prev = next = null;
		}

	}

	public static int secondLargest(Node head) {
		Node temp = head;
		int maxi1 = Integer.MIN_VALUE;
		int maxi2 = Integer.MIN_VALUE;

		while (temp != null) {
			if (temp.data > maxi1) {
				maxi2 = maxi1;
				maxi1 = temp.data;
			} else if (temp.data > maxi2 && temp.data != maxi1) {
				maxi2 = temp.data;
			}
			temp = temp.next;
		}

		return maxi2;
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
//		printForward(head);
		int val = secondLargest(head);
		System.out.println(val);
	}

}
