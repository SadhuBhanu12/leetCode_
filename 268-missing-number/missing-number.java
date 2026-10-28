class Solution {
    public int missingNumber(int[] nums) {
        int a1=0;
        for(int i=0;i<nums.length+1;i++){
            a1=a1^i;
        }
        int a2=0;
        for(int i=0;i<nums.length;i++){
            a2=a2^nums[i];
        }
        return a1^a2;
    }
}