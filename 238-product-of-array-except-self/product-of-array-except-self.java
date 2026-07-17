class Solution {
    public int[] productExceptSelf(int[] nums) {
        int val=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)val*=nums[i];
            else count++;
        }
        if(count>1){
             Arrays.fill(nums,0);
        return nums;}
        for(int i=0;i<nums.length;i++){
            if(count==0){
                nums[i]=val/nums[i];
            }
            if(count==1){
                if(nums[i]!=0)nums[i]=0;
                else nums[i]=val;
            }
        }
        return nums;
    }
}