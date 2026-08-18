class Solution {
    public int largestInteger(int[] nums, int k) {
        
        ArrayList<int[]> list=new ArrayList<>();
        for(int i=0;i<=nums.length-k;i++){
            int arr[]=Arrays.copyOfRange(nums,i,i+k);
            list.add(arr);
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<list.size();i++){
            for(int j=0;j<k;j++){
                    map.put(list.get(i)[j],map.getOrDefault(list.get(i)[j],0)+1);
            }
        }
        int num=-1;
        for(int i:map.keySet()){
            if(k==nums.length){
                num=Math.max(i,num);
            }
            else{
            if(map.get(i)==1){
                num=Math.max(num,i);
            }
            }
        }
        return num;
    }
}