class MyQueue {
    
    private Stack<Integer> pushStack;
    private Stack<Integer> popStack;
    private int front;
    public MyQueue() {
        pushStack = new Stack<>();
        popStack = new Stack<>();
    }
    
    public void push(int x) {
        if (pushStack.isEmpty()) {
            front = x;
        } 
        pushStack.push(x);
    }
    
    public int pop() {
        if(popStack.isEmpty()) {
            while(!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }
        return popStack.pop();
    }
    
    public int peek() {
        if(!popStack.isEmpty()) {
            return popStack.peek();
        }
        return front;
    }
    
    public boolean empty() {
        return pushStack.isEmpty() && popStack.isEmpty();
    }
}

