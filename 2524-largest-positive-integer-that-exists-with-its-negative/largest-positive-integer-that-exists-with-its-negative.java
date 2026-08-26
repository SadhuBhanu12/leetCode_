class Solution {
    public int findMaxK(int[] nums) {
        int max = -1;
        Set<Integer> s =  new HashSet<>(nums.length);
        for(int i = 0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                if(s.contains(-nums[i])){
                    max = Math.max(nums[i],max);
                }
            }
        }
       
        return max;
    }
}