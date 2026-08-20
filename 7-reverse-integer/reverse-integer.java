class Solution {
    public int reverse(int x) {
        if(x==0)return 0;
        int val=x;
        long num=Math.abs((long)x);
        Queue<Integer> queue=new LinkedList<>();
        while(num>0){
            int temp=(int)(num%10);
            num=num/10;
            queue.offer(temp);
        }


        long val1=queue.poll();
        int curr=1;
        while(!queue.isEmpty()){
            long poll=queue.poll();
            val1=(val1*10)+poll;
        }
        val1=(val>0)?val1:-1*val1;
        if(val1<-1*Math.pow(2,31) || val1>Math.pow(2,31)-1)return 0;
        return (int)val1;
    }
}