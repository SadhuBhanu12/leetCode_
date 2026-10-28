class Solution {
    public String longestPalindrome(String s) {
        int count=0;
        String str="";
        for(int i=0;i<s.length();i++){
            int l=i;
            int r=i;
            while(l>=0 && r<s.length()){
                if(s.charAt(l)!=s.charAt(r)){
                    break;
                }
                l--;
                r++;
            }
            if(count<r-l+1){
                count=r-l+1;
                str=s.substring(l+1,r);
            }
              l=i;
            r=i+1;
            while(l>=0 && r<s.length()){
                if(s.charAt(l)!=s.charAt(r)){
                    break;
                }
                l--;
                r++;
            }
          if(count<r-l+1){
                count=r-l+1;
                str=s.substring(l+1,r);
            }
        }
        return str;
    }
}