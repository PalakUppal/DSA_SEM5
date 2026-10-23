package Trees;

public class postOrderTraversalInTree {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	static void postOrder(Node root) {
		if (root == null) {
			return;
		}

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");

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

		postOrder(root);
	}
}
