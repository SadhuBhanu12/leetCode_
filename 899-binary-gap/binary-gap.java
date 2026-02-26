class Solution {
    public int binaryGap(int n) {
       String str=Integer.toBinaryString(n);
      int max=0;
      int prev=-1;
       for (int i=0;i<str.length();i++){
        if (str.charAt(i)=='1'){
            if (prev==-1)prev=i;
            else{
                max=Math.max(i-prev,max);
                prev=i;
            }
        }
       } 
      return max;
    }
}