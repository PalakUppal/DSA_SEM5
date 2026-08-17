package LinkedList;

public class LinkedListCount {

	static class Node {
		int data;
		Node next;

		Node(int val) {
			data = val;
			this.next = null;
		}

	}

	public static int countNode(Node head) {
		Node tempNode = head;

		int cnt = 0;
		while (tempNode != null) {
			cnt++;
			tempNode = tempNode.next;
		}
		return cnt;
	}

	public static boolean search(Node head, int target) {
		Node temp = head;

		while (temp != null) {
			if (temp.data == target) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
//		System.out.println(countNode(head));
		bool ans = search(head, 20);
		if (ans) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
