class MinStack {
        Stack<Integer> stack1;
        Stack<Integer> stack2;
        int min=Integer.MAX_VALUE;
    public MinStack() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }
    
    public void push(int value) {
        stack1.push(value);
        min=Math.min(min,value);
    }
    
    public void pop() {
        stack1.pop();
        min=Integer.MAX_VALUE;
        while(!stack1.isEmpty()){
            int pop1=stack1.pop();
            min=Math.min(pop1,min);
            stack2.push(pop1);
        }
        while(!stack2.isEmpty()){
            int pop1=stack2.pop();
            min=Math.min(pop1,min);
            stack1.push(pop1);
        }
    }
    
    public int top() {
      
        return stack1.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */