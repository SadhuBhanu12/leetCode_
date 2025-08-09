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
    String a2="";
  for (char a3:a){
    a2=a2+a3;
  }
    return a2;
    }
}