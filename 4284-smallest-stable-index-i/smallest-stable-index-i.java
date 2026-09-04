class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=nums[nums.length-1];
        int maxarr[]=new int[nums.length];
        int minarr[]=new int[nums.length];
        maxarr[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            maxarr[i]=Math.min(nums[i],maxarr[i+1]);
        }
        minarr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            minarr[i]=Math.max(nums[i],minarr[i-1]);
        }
        for(int i=0;i<nums.length;i++){
            int val=minarr[i]-maxarr[i];
            if(val<=k){
                return i;
            }  
                  }
                  return -1;
    }
}