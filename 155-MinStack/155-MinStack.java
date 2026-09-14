// Last updated: 9/14/2026, 5:14:34 PM
1class MinStack {
2    Stack<Integer> stack;
3    Stack<Integer> minStack;
4    public MinStack() {
5        stack = new Stack<>();
6        minStack = new Stack<>();
7    }
8    
9    public void push(int value) {
10        stack.push(value);
11        if (minStack.isEmpty() || value<= minStack.peek()) {
12            minStack.push(value);
13        }
14        
15    }
16    
17    public void pop() {
18        if (stack.peek().equals(minStack.peek())) {
19            minStack.pop();
20        }
21        stack.pop();
22    }
23    
24    public int top() {
25        return stack.peek();
26    }
27    
28    public int getMin() {
29        return minStack.peek();
30    }
31}
32
33/**
34 * Your MinStack object will be instantiated and called as such:
35 * MinStack obj = new MinStack();
36 * obj.push(value);
37 * obj.pop();
38 * int param_3 = obj.top();
39 * int param_4 = obj.getMin();
40 */