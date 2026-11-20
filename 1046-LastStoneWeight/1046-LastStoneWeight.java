// Last updated: 11/20/2026, 5:36:11 PM
1class Solution {
2    public int lastStoneWeight(int[] stones) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
4        for (int num : stones) {
5            pq.offer(num);
6        }
7
8        while (pq.size()>1) {
9            int first = pq.poll();
10            int second = pq.poll();
11            int n = first-second;
12            if (n!=0) {
13                pq.offer(n);
14            }
15        }
16        return !pq.isEmpty() ? pq.poll() : 0;
17
18    }
19}