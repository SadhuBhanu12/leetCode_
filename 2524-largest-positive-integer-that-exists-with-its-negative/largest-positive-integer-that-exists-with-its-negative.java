class Solution {
    public int findMaxK(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)list.add(nums[i]);
        int res=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>0 && list.contains(-1*list.get(i)) && list.get(i)>res){
                res=list.get(i);
            }
        }
        return res;
    }
}