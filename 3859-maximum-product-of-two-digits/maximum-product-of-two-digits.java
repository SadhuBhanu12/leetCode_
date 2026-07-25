class Solution {
    public int maxProduct(int n) {
        int a1=0;
        int a2=0;
        while(n>0){
            int temp=n%10;
            n=n/10;
            if(temp>=a2){
            a1=a2;
            a2=temp;
            }
            else if(temp<=a2 && temp>=a1){
                a1=temp;
            }
        }
        return a1*a2;
    }
}