class Solution {
    public int minChanges(int n, int k) {
        if(n==k)return 0;
        String a1=Integer.toBinaryString(n);
        String a2=Integer.toBinaryString(k);
        int count=0;
         System.out.println(a1+"  "+a2);
        if(a1.length()>a2.length()){
            int c=a1.length()-a2.length();
            StringBuilder sb=new StringBuilder(a2);
          for(int i=0;i<c;i++){
                sb.insert(0,'0');
                
            }
            a2=sb.toString();
        }if(a1.length()<a2.length()){
            int c=a2.length()-a1.length();
            StringBuilder sb=new StringBuilder(a1);
               for(int i=0;i<c;i++){
                sb.insert(0,'0');
                
            }
            a1=sb.toString();
        }
       
        for(int i=0;i<a1.length();i++){
            if(a1.charAt(i)==a2.charAt(i))continue;
            else{
            if(a1.charAt(i)=='1'){
                count++;
               
            }
            else return -1;
            }
            
        }
        return count;
    }
}