package Stack;

public class stackIntro {

	static class Stack {
		int[] arr;
		int top;

		Stack(int size) {
			arr = new int[size];
			top = -1;
		}

		void push(int value) {
			if (top == arr.length - 1) {
				System.out.println("Stack overflow");
			}

			arr[++top] = value;
		}

		int pop() {
			if (top == -1) {
				System.out.println("System Underflow");
				return -1;
			}
			return arr[top--];
		}

		int peek() {
			if (top == -1) {
				return -1;
			}
			return arr[top];
		}

		void display() {
			for (int i = top; i >= 0; i--) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack st = new Stack(5);
		st.push(10);
		st.push(20);
		st.push(30);
		st.display();

		System.out.println("Popped: " + st.pop());
		System.out.println("The top Element: " + st.peek());
		st.display();

	}

}
