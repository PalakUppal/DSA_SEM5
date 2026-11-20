// Last updated: 11/20/2026, 6:11:13 PM
1class StockSpanner {
2    Stack<int[]> st;
3    int ind;
4
5    public StockSpanner() {
6        st = new Stack<>(); 
7        ind = -1;   
8    }
9    
10    public int next(int price) {
11        ind = ind+1;
12
13        while (!st.isEmpty() && st.peek()[0]<=price) {
14            st.pop();
15        }
16
17        int ans = ind - (!st.isEmpty() ? st.peek()[1] : -1);
18        st.push(new int[]{price, ind});
19        return ans;
20    }
21}
22
23/**
24 * Your StockSpanner object will be instantiated and called as such:
25 * StockSpanner obj = new StockSpanner();
26 * int param_1 = obj.next(price);
27 */