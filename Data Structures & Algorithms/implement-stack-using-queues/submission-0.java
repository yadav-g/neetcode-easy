class MyStack {

    List<Integer> stackList;
    private int idx;

    public MyStack() {
        this.stackList=new ArrayList<>();
        this.idx=-1;
    }
    
    public void push(int x) {
        stackList.add(x);
        idx++;
    }
    
    public int pop() {
        int val=stackList.remove(idx);
        idx--;
        return val;
    }
    
    public int top() {
        return stackList.get(idx);
    }
    
    public boolean empty() {
        return idx==-1;
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