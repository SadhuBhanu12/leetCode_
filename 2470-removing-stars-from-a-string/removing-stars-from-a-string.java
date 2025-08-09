class Solution {
    public String removeStars(String s) {
       Stack<Character> a=new Stack<>(); 
    for (char a1:s.toCharArray()){
        if (a1!='*'){
            a.push(a1);
        }
        else{
            a.pop();
        }
    }
    StringBuilder a2=new StringBuilder();
  for (char a3:a){
    a2.append(a3);
  }
    return a2.toString();
    }
}