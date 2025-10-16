class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for (int i=left;i<=right;i++){
            int countbit=Integer.bitCount(i);
            int magic=665772;
            magic=(magic>>=countbit);
            if ((magic&1)==1)count++;
        }
        return count;
    }
    
  
}