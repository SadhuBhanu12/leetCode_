class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int arr[][]=new int[map.size()][2];
        int c=0;
        for(int i:map.keySet()){
            arr[c][0]=i;
            arr[c][1]=map.get(i);
            c++;
        }
        Arrays.sort(arr,(a,b)-> Integer.compare(a[1],b[1]));
        int res[]=new int[k];
        int count=0;
        for(int i=arr.length-1;i>=0;i--){
            
            if(count>=k)break;
            else{
                res[count]=arr[i][0];
                count++;
            }
        }
        return res;

    }
}