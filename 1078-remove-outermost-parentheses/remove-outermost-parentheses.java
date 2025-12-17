class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> stack=new Stack<>();
      
        for (char i:s.toCharArray()){
            if (i=='('){
                if (!stack.isEmpty())sb.append(i);
            stack.push(i);
            }
            
            else{
                stack.pop();
                if(!stack.isEmpty())sb.append(i);
            }
        }
        return sb.toString();
    }
}