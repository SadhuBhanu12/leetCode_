class Solution {
    int count=0;
    public int hammingWeight(int n) {
        if (n!=0){
            count++;
        hammingWeight(n&(n-1));
        }
        return count;
    }
}