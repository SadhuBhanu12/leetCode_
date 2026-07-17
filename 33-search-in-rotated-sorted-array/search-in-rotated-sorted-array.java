class Solution {
    public int search(int[] nums, int target) {
        int index=-1;
        for(int i=0;i<nums.length-1;i++)if(nums[i]>nums[i+1]){
            index=i+1;
            break;
        }
        if (index == -1)
    return binary(nums, 0, nums.length - 1, target);
        if(nums[0]<=target && target<=nums[index-1])return binary(nums,0,index-1,target);
        return binary(nums,index,nums.length-1,target);
    }
    public int binary(int nums[],int l1,int r1,int target){
        int l=l1;
        int r=r1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]<target){
                l=mid+1;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
        }
        return -1;
    }
}