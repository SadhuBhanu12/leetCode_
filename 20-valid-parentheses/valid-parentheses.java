class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char a1:s.toCharArray()){
            if(a1=='{'||a1=='['||a1=='('){
                st.push(a1);
            }
            else{
                if(st.isEmpty()){return false;}
                char pop1=st.pop();
                if(a1=='}' && pop1!='{')return false;
                 if(a1==')' && pop1!='(')return false;
                  if(a1==']' && pop1!='[')return false;
            
            }
        }
        return st.isEmpty();
    }
}