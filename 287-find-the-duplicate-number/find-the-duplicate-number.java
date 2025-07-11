class Solution {
    public int findDuplicate(int[] nums) {
       HashSet<Integer> a=new HashSet<>();
       for (int num:nums){
        if (a.contains(num)){
            return num;
        }
        else{
            a.add(num);
        }
       }
       return -1;
        
    }
}