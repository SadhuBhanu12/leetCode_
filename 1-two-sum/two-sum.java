class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]={-1,-1};
        HashMap<Integer,Integer> set=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (set.containsKey(target-nums[i])){
                arr[0]=set.get(target-nums[i]);
                arr[1]=i;
                break;}
            
            set.put(nums[i],i);
        }
        return arr;
    }
}