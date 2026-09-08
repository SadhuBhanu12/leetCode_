class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)return 0;
        if(s.length()==1)return 1;
        int arr[]=new int[128];
        int max=0;
        String res="";
        Arrays.fill(arr,-1);
        String a1="";
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)]==-1){
                arr[s.charAt(i)]=i;
                a1=a1+s.charAt(i);
            }
            else{
                if(max<a1.length()){
                    res=a1;
                    max=a1.length();
                }
                int len=a1.length();
          String str = a1.substring(a1.indexOf(s.charAt(i))+1);
                arr[s.charAt(i)]=i;
                a1=str+s.charAt(i);
            }
        }
        if(max<a1.length()){
                    res=a1;
                    max=a1.length();
                }
                return res.length();
    }
}