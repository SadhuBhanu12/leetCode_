class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int index=0;
      int sum=0;
      int max=Integer.MAX_VALUE;
      for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>=target){
                while(sum>=target && index<nums.length){
                      max=Math.min(i+1-(index),max);
                    sum=sum-nums[index];
                    index++;
                }
                
            }
      }
    

      
      return (max==Integer.MAX_VALUE)?0:max;  
    }
}