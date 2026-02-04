class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int sum1=0;
        int sum2=0;
        for (int i=0;i<k;i++)sum1+=nums[i];
        for (int i=nums.length-1;i>=nums.length-k;i--)sum2+=nums[i];
        return Math.abs(sum1-sum2);
    }
}