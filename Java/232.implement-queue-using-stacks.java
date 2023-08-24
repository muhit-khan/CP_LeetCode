/*
 * [232] Implement Queue using Stacks
 */

class MyQueue {
    private Stack<Integer> stack1; // For pushing elements
    private Stack<Integer> stack2; // For popping and peeking elements

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    private void transfer() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }

    public int pop() {
        if (stack2.isEmpty()) {
            transfer();
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            transfer();
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
