class Solution {
    public long sumAndMultiply(int n) {
        long num=0;
        long val=1;
        long sum=0;
        while(n>0){
            int temp=n%10;
            if(temp!=0){
            num+=temp*val;
            val=val*10;
            sum+=temp;
            }
            n=n/10;
        }
        return num*sum;
    }
}