// Last updated: 10/5/2026, 5:13:25 PM
1class RecentCounter {
2    Queue<Integer> q;
3
4    public RecentCounter() {
5        q = new LinkedList<>();
6    }
7    
8    public int ping(int t) {
9        q.add(t);
10        while (q.peek() < t-3000) {
11            q.poll();
12        }
13        return q.size();
14    }
15}
16
17/**
18 * Your RecentCounter object will be instantiated and called as such:
19 * RecentCounter obj = new RecentCounter();
20 * int param_1 = obj.ping(t);
21 */