package searching;

public class Findoccurence {

	static int Firstoccurence(int[] arr, int target) {
		int ans = -1;
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				ans = mid;
				high = mid - 1;
			} else if (target > arr[mid])
				low = mid + 1;
			else
				high = mid - 1;
		}
		return ans;
	}

	static int LastOccurence(int[] arr, int target) {
		int low = 0, high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				ans = mid;
				low = mid + 1;
			} else if (target > arr[mid])
				low = mid + 1;
			else
				high = mid - 1;
		}
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		              0, 1, 2, 3, 4, 5, 6
		int[] arr = { 1, 2, 2, 2, 3, 4, 5 };
		int target = 2;
		int first = Firstoccurence(arr, target);
		int last = LastOccurence(arr, target);
		System.out.println(first + " " + last);
		if (first == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println(last - first + 1);
		}

	}

}
