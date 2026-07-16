class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char a1:s.toCharArray()){
            if(a1=='('||a1=='{'||a1=='[')stack.push(a1);
            else{
                if(stack.isEmpty())return false;
                else{
                char poll1=stack.pop();
                if(poll1=='(' && a1!=')'|| poll1=='[' && a1!=']'||poll1=='{' && a1!='}')return false;
                }

            }

        }
        return stack.isEmpty();
    }
}