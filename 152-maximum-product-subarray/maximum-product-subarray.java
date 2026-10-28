class Solution {
    public int maxProduct(int[] nums) {
        int min1=nums[0];
        int max1=nums[0];
        int curr=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=max1;
                max1=min1;
                min1=temp;
            }
            min1=Math.min(nums[i],nums[i]*min1);
            max1=Math.max(nums[i],nums[i]*max1);
            curr=Math.max(curr,max1);
        }
        return curr;
    }
}