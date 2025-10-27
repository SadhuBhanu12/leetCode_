class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, nums, 0, new ArrayList<>());
        return list;
    }

    public void backtrack(List<List<Integer>> list, int[] nums, int i, List<Integer> res) {
      
        list.add(new ArrayList<>(res));

        for (int c = i; c < nums.length; c++) {
            res.add(nums[c]);                     
            backtrack(list, nums, c + 1, res);  
            res.remove(res.size() - 1);          
        }
    }
}
