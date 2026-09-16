class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i:nums)sum+=i;
        int curr_sum=0;
        for(int i=0;i<nums.length;i++){
                    sum-=nums[i];
           
    
            if(curr_sum==sum)return i;
             curr_sum+=nums[i];
        }
        return -1;
    }
}