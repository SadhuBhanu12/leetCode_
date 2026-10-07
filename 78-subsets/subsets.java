class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> list=new ArrayList<>();
       gener(nums,list,0,new ArrayList<>());
       return list; 
    }
    public void gener(int nums[],List<List<Integer>> list,int index,List<Integer> val){
        if(index==nums.length){
         list.add(new ArrayList<>(val));
            return;
        }
        gener(nums,list,index+1,val);
        val.add(nums[index]);
        gener(nums,list,index+1,val);
          val.remove(val.size() - 1);
        
    }
}