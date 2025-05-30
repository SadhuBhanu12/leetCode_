class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum1=0;
        int sum2=0;
        for (int i=0;i<gas.length;i++){
            sum1+=gas[i];
            sum2+=cost[i];
        }
        if (sum2>sum1){
            return -1;
        }
        int start=0;
        int currgas=0;
        for (int i=0;i<gas.length;i++){
            currgas+=gas[i]-cost[i];
            if (currgas<0){
                currgas=0;
                start=i+1;
            }
            
        }
       
        
       return start; 


    }
}