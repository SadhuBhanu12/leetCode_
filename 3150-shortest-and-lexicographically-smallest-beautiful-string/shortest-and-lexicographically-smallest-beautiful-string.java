class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String a="";
        int count=0;
        int len=Integer.MAX_VALUE;
        String res="";
        
        for(int i=0;i<s.length();i++){
            a=a+s.charAt(i);
            if(s.charAt(i)=='1')count++;
            if(count==k){
                while(a.length()>k && a.charAt(0)=='0'){
                    a=a.substring(1);
                }
                
                if(len>a.length() || (a.length() == len && a.compareTo(res) < 0)){
                    len=a.length();
                    res=a;
                }
              
                a=a.substring(1,a.length());
                count--;
                
            }
        }
        
        return res;
    }
}