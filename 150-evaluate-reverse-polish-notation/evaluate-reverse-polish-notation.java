class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operand=new Stack<>();
        Queue<String> operators=new LinkedList<>();
        for (int i=0;i<tokens.length;i++){
            if (tokens[i].equals("+")|| tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
             
            int poll1=operand.pop();
            int poll2=operand.pop();
            String oper=tokens[i];
            if (oper.equals("+")){
                operand.push(poll2+poll1);
            }
            if (oper.equals("-")){
                operand.push(poll2-poll1);
            }
            if (oper.equals("/")){
                operand.push(poll2/poll1);
            }
            if (oper.equals("*")){
                operand.push(poll2*poll1);
            
        }
            }
            else{
                operand.push(Integer.parseInt(tokens[i]));
            }
        }
        
       return operand.pop();
    }
}