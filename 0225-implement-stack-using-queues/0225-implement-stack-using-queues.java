class MyStack {
    Queue<Integer> q1;
    int top;
   
    
    public MyStack() {
        q1=new LinkedList();
    }
    
    public void push(int x) {
        q1.add(x);
        top=x;
    }
    
    public int pop() {
       int size=q1.size();
        while(size!=1){
            top=q1.remove();
            q1.add(top);
            size--;
        }
        return q1.remove();
    }
    
    public int top() {
      return top;
    }
    
    public boolean empty() {
       
        return q1.isEmpty();
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