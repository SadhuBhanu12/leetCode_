class Solution {
    public int reverse(int x) {
        long val=0;
        long num=(long)x;
        while(num!=0){
            int temp=(int)num%10;
            val=val*10+temp;
            num=num/10;

        }
        if(val>Integer.MAX_VALUE || val<Integer.MIN_VALUE)return 0;
        return (int)val;
    }
}