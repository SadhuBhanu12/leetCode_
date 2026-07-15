class Solution {
    public int gcdOfOddEvenSums(int n) {
        // int even_sum=0;
        // int odd_sum=0;
        // int curr_1=0;
        // int curr_2=0;
        // for(int i=0;i<n;i++){
            
        //     even_sum+=(2*i);
        //     odd_sum+=((2*i)+1);
        // }
        // even_sum+=(2*n);
       
       return gcd(n*n,n*(n+1));
      
       
    }
    public int gcd(int n1,int n2){
        return n2==0 ? n1:gcd(n2,n1%n2);
    }
}