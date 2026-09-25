class Solution {
    public int minFlipsMonoIncr(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')count++;
        }
    
        int curr=0;
        int count1=count;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')curr++;
              

            int lef=(i+1)-curr;
            int rig=count-curr;
            count1=Math.min(count1,lef+rig);

        }
        return count1;
    }
}