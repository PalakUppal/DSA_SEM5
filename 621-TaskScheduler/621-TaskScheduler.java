// Last updated: 11/20/2026, 5:33:07 PM
1class Solution {
2    public int leastInterval(char[] tasks, int n) {
3        int[] freq = new int[26];
4
5        for (char t : tasks) {
6            freq[t-'A']++;
7        }
8
9        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
10        for (int f : freq) {
11            if (f > 0) {
12                pq.offer(f);
13            }
14        }
15
16        Queue<int[]> coolDown = new LinkedList<>();
17        int time = 0;
18
19        while (!pq.isEmpty() || !coolDown.isEmpty()) {
20            time++;
21            if (!coolDown.isEmpty() && coolDown.peek()[1]<=time) {
22                int[] ready = coolDown.poll();
23                pq.offer(ready[0]);
24            }
25            if (!pq.isEmpty()) {
26                int remain = pq.poll();
27                remain--;
28                if (remain>0) {
29                    coolDown.offer(new int[]{remain, time+n+1});
30                }
31            }
32        }
33        return time;
34    }
35}