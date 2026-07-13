class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
    PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)-> Integer.compare(a[1],b[1]));
    for(int i:map.keySet()){
        pq.offer(new int[]{i,map.get(i)});
    }
    int count=0;
    int arr[]=new int[map.size()];
    while(!pq.isEmpty()){
        int arr1[]=pq.poll();
        arr[count++]=arr1[0];
    }
    int res[]=new int[k];
    int c1=0;
    for(int i=arr.length-1;i>=0;i--){
            if(c1==k)break;
            else{
                res[c1++]=arr[i];
            }
    }
        return res;
    }
}