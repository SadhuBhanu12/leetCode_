class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        if(nums.length==1)return 1;
        Arrays.sort(nums);
        int max=1;
        int prev=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(prev==nums[i]){
                continue;
            }
            else if(prev==nums[i]-1){
                count++;
                prev=nums[i];
                max=Math.max(count,max);
            }else{
                count=1;
                prev=nums[i];
                max=Math.max(count,max);
            }
        }
        return max;
    }
}