class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length()!=goal.length())return false;
   int c=0;
   while(c<goal.length()){
    String a=goal.charAt(goal.length()-1)+"";
    String sec=goal.substring(0,goal.length()-1);
    String com=a.concat(sec);
    if (s.equals(com))return true;
    goal=com;
    c++;
   }
   return false;
    }
}