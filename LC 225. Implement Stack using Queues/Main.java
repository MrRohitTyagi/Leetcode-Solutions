class MyStack {
    
    Deque<Integer> stack;

    public MyStack() {
        stack = new ArrayDeque<Integer>();
    }
    
    public void push(int x) {
        stack.addFirst(x);
    }
    
    public int pop() {
        return stack.poll();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public boolean empty() {
        return stack.size() == 0;
    }
}