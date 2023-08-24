/*
 * [155] Min Stack
 */


class MinStack {
    private Stack<Integer> mainStack;  // Holds the actual elements
    private Stack<Integer> minStack;   // Holds the minimum elements

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        mainStack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        if (!mainStack.isEmpty()) {
            if (mainStack.peek().equals(minStack.peek())) {
                minStack.pop();
            }
            mainStack.pop();
        }
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */