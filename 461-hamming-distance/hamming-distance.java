class Solution {
    int count=0;
    public int hammingDistance(int x, int y) {
        int a=x^y;
        hammingWeight(a);
        return count;
    }
  
    public void hammingWeight(int n) {
        if (n!=0){
            count++;
        hammingWeight(n&(n-1));
        }
        
    }
}