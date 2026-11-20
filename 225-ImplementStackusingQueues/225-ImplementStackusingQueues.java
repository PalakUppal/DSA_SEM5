// Last updated: 11/20/2026, 6:00:12 PM
1class MyStack {
2
3    Queue<Integer> q1;
4    Queue<Integer> q2;
5
6    public MyStack() {
7        q1 = new LinkedList<>();
8        q2 = new LinkedList<>();
9    }
10    
11    public void push(int x) {
12        q2.add(x);
13        while (!q1.isEmpty()) {
14            q2.add(q1.remove());
15        }
16        Queue<Integer> temp = q1;
17        q1 = q2;
18        q2 = temp;
19    }
20    
21    public int pop() {
22        return q1.remove();
23    }
24    
25    public int top() {
26        return q1.peek();
27    }
28    
29    public boolean empty() {
30        return q1.isEmpty();
31    }
32}
33
34/**
35 * Your MyStack object will be instantiated and called as such:
36 * MyStack obj = new MyStack();
37 * obj.push(x);
38 * int param_2 = obj.pop();
39 * int param_3 = obj.top();
40 * boolean param_4 = obj.empty();
41 */