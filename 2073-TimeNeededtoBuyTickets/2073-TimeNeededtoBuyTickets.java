// Last updated: 10/8/2026, 5:22:10 PM
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        Queue<Integer> q = new LinkedList<>();
4
5        for (int i=0; i<tickets.length; i++) {
6            q.add(i);
7        }
8        int time = 0;
9
10        while (true) {
11            int person = q.poll();
12            tickets[person]--;
13            time++;
14            if (person == k && tickets[person]==0) {
15                return time;
16            }
17            if (tickets[person] > 0) {
18                q.add(person);
19            }
20        }
21    }
22}