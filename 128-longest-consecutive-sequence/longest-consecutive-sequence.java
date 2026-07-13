class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Arrays.sort(nums);
        int count=1;
        int curr_count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])continue;
            if(nums[i]==(nums[i+1]-1)){
                curr_count++;
                count=Math.max(curr_count,count);
            }
            else{
                count=Math.max(curr_count,count);
                curr_count=1;
            }
        }
        return count;
    }
}