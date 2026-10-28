class Solution {
    public int longestConsecutive(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)pq.offer(nums[i]);
        if(pq.isEmpty())return 0;
        int count=1;
        int rem=pq.poll();
        int curr=1;
        while(!pq.isEmpty()){
            int poll1=pq.poll();
            if(poll1==rem){
                continue;
            }
            else if(poll1==rem+1){
                rem=poll1;
                curr++;
                count=Math.max(curr,count);
            }
            else{
                  count=Math.max(curr,count);
                rem=poll1;
                curr=1;
              

            }
        }
        return count;
    }
}