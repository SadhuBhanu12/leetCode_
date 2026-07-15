class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even_sum=0;
        int odd_sum=0;
        int curr_1=0;
        int curr_2=0;
        for(int i=0;i<n;i++){
            
            even_sum+=(2*i);
            odd_sum+=((2*i)+1);
        }
        even_sum+=(2*n);
       
       return gcd(even_sum,odd_sum);
      
       
    }
    public int gcd(int n1,int n2){
        int i=2;
        int count=1;
       while(n1!=1 ||n2!=1){
        if(n1%i==0 && n2%i==0){
            count*=i;
            n1=n1/i;
            n2=n2/i;
        }else if(n1%i==0 && n2%i!=0){
            n1=n1/i;
        }
        else if(n2%i==0 && n1%i!=0){
            n2=n2/i;
        }
            else{
            i++;
        }
       }
       return count;
    }
}