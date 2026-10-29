class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            count+=check(s,i,i);
            count+=check(s,i,i+1);
        }
        return count;
    }
    public int check(String s,int l,int r){
        int count=0;
        while(l>=0 && r<=s.length()-1){
            if(s.charAt(l)!=s.charAt(r))break;
            else count++;
            l--;
            r++;
        }
        return count;
    }
}