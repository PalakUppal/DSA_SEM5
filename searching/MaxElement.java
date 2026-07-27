package searching;

public class MaxElement {

	public static int maxEl(int[] arr) {
		int maxi = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (maxi < arr[i])
				maxi = arr[i];
		}
		return maxi;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 25, 19, 78 };

		System.out.println("maximum: " + maxEl(arr));
	}

}
