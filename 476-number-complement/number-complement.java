class Solution {
    public int findComplement(int num) {
       int temp=num;
       int mask=0000;
       while(num!=0){
        mask=(mask<<=1)|1;
        num>>=1;
       }

return temp^mask;
    }
}