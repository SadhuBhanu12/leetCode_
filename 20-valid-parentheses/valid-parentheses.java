class Solution {
    public boolean isValid(String s) {
        Stack<Character> a=new Stack<>();
        HashMap<Character,Character> a1=new HashMap<>();
        a1.put(')','(');
        a1.put(']','[');
        a1.put('}','{');
        for (char a2:s.toCharArray()){
            if (a1.containsKey(a2)){
                char ele=(a.isEmpty())? '#':a.pop();
                if(ele!=a1.get(a2)){
                    return false;
                }
            }
            else{
                a.push(a2);
            }
        }
        return a.isEmpty();
    }
}