class Solution {
    public boolean doesAliceWin(String s) {
   
     int count = 0;
for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);
    if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
        ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        count++;
    }
}

        if (count==0)return false;
      if ((count%3==0)&&(count%3)/2==1){
        return false;
      }
    
      return true;
    }
   
}