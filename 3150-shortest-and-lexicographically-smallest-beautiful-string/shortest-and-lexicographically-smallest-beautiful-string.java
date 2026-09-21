class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String res="";
        int count=0;
        int len=Integer.MAX_VALUE;
        int l=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')count++;
            while(count==k){
                String sub=s.substring(l,i+1);
                if(sub.length()<len ){
                    res=sub;
                    len=sub.length();
                }
                else if(sub.length()==len && res.compareTo(sub)>0){
                    res=sub;
                }
                if(s.charAt(l)=='1'){
                    count--;
                }
                l++;
            }
        }
        return res;
    }
}