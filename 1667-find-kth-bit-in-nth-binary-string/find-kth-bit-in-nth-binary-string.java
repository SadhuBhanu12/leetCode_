class Solution {
    public char findKthBit(int n, int k) {
        String s1="0";
        if (n==1)return s1.charAt(k-1);
       
        
        for (int i=2;i<=n;i++){
           
            String rev=s1.replace('0','x').replace('1','0').replace('x','1');
           
             StringBuilder sb=new StringBuilder(rev);
             sb.reverse();
             s1=s1+"1"+(sb.toString());
            
        }
   System.out.println(s1);

        return s1.charAt(k-1);
    }
}