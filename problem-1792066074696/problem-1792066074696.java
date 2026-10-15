// Last updated: 10/15/2026, 5:37:54 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap<Integer,Integer> mp = new HashMap<>();
4
5        for (int x : nums) {
6            mp.put(x, mp.getOrDefault(x, 0) + 1);
7        }
8
9        PriorityQueue<Integer> pq = new PriorityQueue<>(
10            (a,b)->mp.get(a)-mp.get(b)
11        );
12
13        for (int key : mp.keySet()) {
14            pq.add(key);
15            if (pq.size() > k) {
16                pq.poll();
17            }
18        }
19        int[] ans = new int[k];
20
21        for (int i=0; i<k; i++) {
22            ans[i] = pq.poll();
23        }
24
25        return ans;
26    }
27}