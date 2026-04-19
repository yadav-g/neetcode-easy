class MyStack {

    private Queue<Integer> queueAsStack;

    public MyStack() {
        this.queueAsStack=new LinkedList<>();
    }
    
    public void push(int x) {
        queueAsStack.offer(x);
        for(int i=queueAsStack.size()-1;i>0;i--){
            queueAsStack.offer(queueAsStack.poll());
        }
    }
    
    public int pop() {
        return queueAsStack.poll();
    }
    
    public int top() {
        return queueAsStack.peek();
    }
    
    public boolean empty() {
        return queueAsStack.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */