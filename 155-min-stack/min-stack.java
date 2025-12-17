class MinStack {
    Stack<int[]> stack;
    int min1=Integer.MAX_VALUE;
    public MinStack() {
        stack=new Stack<>();
    }
    
    public void push(int val) {
  
     min1=Math.min(min1,val);
        stack.push(new int[]{val,min1});
    }
    
    public void pop() {
       
        if (!stack.isEmpty())stack.pop();
         if (!stack.isEmpty()){int pee1[]=stack.peek();
         min1=pee1[1];
         }
         if (stack.isEmpty())min1=Integer.MAX_VALUE;
    }
    
    public int top() {
        int a1[]=stack.peek();
        return a1[0];
    }
    
    public int getMin() {
        int a2[]=stack.peek();
        return a2[1];
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