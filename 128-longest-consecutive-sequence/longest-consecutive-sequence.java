class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Arrays.sort(nums);
        int prev=nums[0];
        int curr=1;
        int max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==prev){
                continue;
            }
            if(nums[i]==prev+1){
                prev=nums[i];
                curr++;
                max=Math.max(curr,max);
            }
            else{
                prev=nums[i];
                curr=1;
                max=Math.max(curr,max);
            }
        }
        return max;
    }
}