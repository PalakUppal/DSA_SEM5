// Last updated: 10/15/2026, 5:18:51 PM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>();
4
5        for (int x : nums) {
6            pq.add(x);
7            if (pq.size() > k) {
8                pq.poll();
9            }
10        }
11        return pq.poll();
12    }
13}