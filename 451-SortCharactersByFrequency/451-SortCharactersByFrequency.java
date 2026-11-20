// Last updated: 11/20/2026, 5:20:55 PM
1class Solution {
2    public String frequencySort(String s) {
3        // b-2, A-1, a-1
4        HashMap<Character, Integer> mp = new HashMap<>();
5
6        for (char ch : s.toCharArray()) {
7            mp.put(ch, mp.getOrDefault(ch, 0) +1);
8        }
9
10        PriorityQueue<Character> pq = new PriorityQueue<>(
11            (a,b) -> mp.get(b)-mp.get(a)
12        );
13        
14        for (char ch : mp.keySet()) {
15            pq.add(ch);
16        }
17
18        StringBuilder sb = new StringBuilder();
19        while (!pq.isEmpty()) {
20            char ch = pq.poll();
21            int freq = mp.get(ch);
22            for (int i=0; i<freq; i++) {
23                sb.append(ch);
24            }
25        }
26
27        return sb.toString();
28        
29    }
30}