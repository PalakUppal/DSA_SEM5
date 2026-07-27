package sorting;

import java.util.Arrays;

public class kthSmallestElement {

	public static void kthSmallest(int[] arr, int k) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 3, 2, 8, 4 };
		int k = 3;
		kthSmallest(arr, k);

		System.out.println(Arrays.toString(arr));

		System.out.println(arr[k - 1]);

	}

}
