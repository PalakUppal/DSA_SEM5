// Last updated: 8/3/2026, 10:36:54 PM
1import java.util.Random;
2
3class Solution {
4
5    private static void merge(int[] arr, int low, int mid, int high) {
6        int[] temp = new int[high-low+1];
7        int k = 0;
8        int left = low;
9        int right = mid+1;
10
11        while (left <= mid && right<=high) {
12            if (arr[left] <= arr[right]) {
13                temp[k++] = arr[left++];
14            }
15            else {
16                temp[k++] = arr[right++];
17            }
18        }
19
20        while (left <= mid) {
21            temp[k++] = arr[left++];
22        }
23        while (right <= high) {
24            temp[k++] = arr[right++];
25        }
26        for (int i=low; i<=high; i++) {
27            arr[i] = temp[i-low];
28        }
29    }
30
31    private void mergeSort(int[] arr, int low, int high) {
32        if (low >= high) return;
33
34        int mid = low+(high-low)/2;
35        mergeSort(arr, low, mid);
36        mergeSort(arr, mid+1, high);
37        merge(arr, low, mid, high);
38    }
39
40    public int[] sortArray(int[] nums) {
41        mergeSort(nums, 0, nums.length-1);
42        return nums;
43    }
44}