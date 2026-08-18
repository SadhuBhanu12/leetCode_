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
       
        char arr1[]=a1.toCharArray();
        char arr2[]=a2.toCharArray();
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==arr2[i])continue;
            else{
            if(arr1[i]=='1'){
                arr1[i]=0;
                count++;
               
            }
            else return -1;
            }
            
        }
        return count;
    }
}