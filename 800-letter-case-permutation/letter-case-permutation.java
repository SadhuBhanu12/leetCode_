class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> list=new ArrayList<>();
        backtrack(new StringBuilder(s),0,list);
        return list;
    }
    public void backtrack(StringBuilder sb,int i,List<String> list){
        if (i==sb.length()){
            list.add(sb.toString());
            return;
        }
        if (Character.isDigit(sb.charAt(i))){
            backtrack(sb,i+1,list);
            return;
        }
        sb.setCharAt(i,Character.toLowerCase(sb.charAt(i)));
        backtrack(sb,i+1,list);
          sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
           backtrack(sb,i+1,list);

    }
}