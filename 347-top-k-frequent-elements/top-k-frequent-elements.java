class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++)map.put(nums[i],map.getOrDefault(nums[i],0)+1);
   
    PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)-> Integer.compare(a[1],b[1]));
    for (int i:map.keySet()){
        pq.add(new int[]{i,map.get(i)});
    }
    int arr[]=new int[map.size()];
    int i1=0;
    while(!pq.isEmpty()){
        int[]a1=pq.poll();
        arr[i1++]=a1[0];
    }
    int arr1[]=new int[k];
    int c=0;
    System.out.println(Arrays.toString(arr));
    for (int i=arr.length-1;i>=0;i--){
        if (c==k)break;
        else{
arr1[c++]=arr[i];
        }
    }
    return arr1;
    
    }
}