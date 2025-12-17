class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for (char i:s.toCharArray()){
            if (!stack.isEmpty() &&stack.peek()==i){
                stack.pop();
            }
            else{
                stack.push(i);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty())sb.append(stack.pop());
        sb.reverse();
        return sb.toString();
    }
}