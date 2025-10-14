class Solution {
    public int missingNumber(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for (int i=0;i<nums.length;i++)set.add(nums[i]);
        int c=0;
       
        for (int i:set){
            if ((c)!=i){
                return c;
            }c++;
        }
        return set.size();
    }
}