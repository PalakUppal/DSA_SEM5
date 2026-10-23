package Trees;

public class InOrderTraversalInTrees {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	static void inOrder(Node root) {
		if (root == null) {
			return;
		}

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		inOrder(root);
	}
}
