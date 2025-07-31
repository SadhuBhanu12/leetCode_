class Solution {
    public int rob(int[] nums) {
        if (nums.length<2)return nums[0];
       int dp[]=new int[nums.length-1];
       int dp2[]=new int[nums.length-1];
       dp=Arrays.copyOfRange(nums,0,nums.length-1);
       dp2=Arrays.copyOfRange(nums,1,nums.length);
       
       
        
    
return Math.max(rob1(dp),rob1(dp2));
    }
    public int rob1(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int dp[]=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[1],nums[0]);
        for (int i=2;i<dp.length;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[nums.length-1];
    }
}