class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left[]=new int[nums.length+1];
        int right[]=new int[nums.length+1];
        left[0]=1;
        right[right.length-1]=1;
        int c1=1;
        int c2=1;
        for (int i=0;i<nums.length;i++){
           c1=c1*nums[i];
           left[i+1]=c1;
        }
        for (int i=nums.length-1;i>=0;i--){
           c2=c2*nums[i];
           right[i]=c2;
        }
        
        for (int i=1;i<left.length;i++){
            nums[i-1]=left[i-1]*right[i];
        }
        return nums;
    }
}