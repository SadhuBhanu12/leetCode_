class Solution {
    public void nextPermutation(int[] nums) {
        int piv=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                piv=i-1;
                break;
            }
        }
        if(piv==-1){
            rev(nums,0,nums.length-1);
            return;
        }
        for(int j=nums.length-1;j>=piv+1;j--){
            if(nums[j]>nums[piv]){
                int temp=nums[j];
                nums[j]=nums[piv];
                nums[piv]=temp;
                break;
            }
        }
        rev(nums,piv+1,nums.length-1);
    }
    public void rev(int nums[],int l,int r){
        while(l<=r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}