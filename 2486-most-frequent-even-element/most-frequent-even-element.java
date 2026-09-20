class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        int max=0;
        int num=-1;
        for(int i:map.keySet()){
            if(map.get(i)>max){
                max=map.get(i);
                num=i;
                
            }
            else if(map.get(i)>=max && num>i){
                num=i;
            }
        }
        return num;
    }
}