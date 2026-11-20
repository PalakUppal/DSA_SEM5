// Last updated: 11/20/2026, 5:56:47 PM
1class Solution {
2    public int[] deckRevealedIncreasing(int[] deck) {
3        Arrays.sort(deck);
4        int n = deck.length;
5        int[] ans = new int[n];
6        Queue<Integer> q = new LinkedList<>();
7        for (int i=0; i<n; i++) {
8            q.add(i);
9        }
10        
11        for (int card:deck) {
12            int index = q.poll();
13            ans[index] = card;
14            if (!q.isEmpty()) {
15                q.add(q.poll());
16            }
17        }
18        return ans;
19    }
20}