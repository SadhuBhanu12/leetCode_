class Solution {
    public boolean doesAliceWin(String s) {
        int count=0;
        for (int i=0;i<s.length();i++){
            if (checkvowel(s.charAt(i)))count++;
        }
        if (count==0)return false;
      if ((count%3==0)&&(count%3)/2==1){
        return false;
      }
    
      return true;
    }
    public boolean checkvowel(char s){
        return "aeiouAEIOU".indexOf(s)>=0;
    }
}