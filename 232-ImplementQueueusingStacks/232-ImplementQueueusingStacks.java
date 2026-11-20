// Last updated: 11/20/2026, 6:00:44 PM
1class MyQueue {
2
3    Stack<Integer> st1;
4    Stack<Integer> st2;
5
6    public MyQueue() {
7        st1 = new Stack<>();
8        st2 = new Stack<>();
9    }
10    
11    public void push(int x) {
12        st1.push(x);
13    }
14    
15    public int pop() {
16        if (st2.isEmpty()) {
17            while (!st1.isEmpty()) {
18                st2.push(st1.pop());
19            }
20        }
21        return st2.pop();
22    }
23    
24    public int peek() {
25        if (st2.isEmpty()) {
26            while (!st1.isEmpty()) {
27                st2.push(st1.pop());
28            }
29        }
30        return st2.peek();
31    }
32    
33    public boolean empty() {
34        return st2.isEmpty() && st1.isEmpty();
35    }
36}
37
38/**
39 * Your MyQueue object will be instantiated and called as such:
40 * MyQueue obj = new MyQueue();
41 * obj.push(x);
42 * int param_2 = obj.pop();
43 * int param_3 = obj.peek();
44 * boolean param_4 = obj.empty();
45 */