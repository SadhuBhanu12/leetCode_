class Solution {
    public int minimumDeletions(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')count++;
        }
        int count1=count;
        int curr=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')curr++;
            int lef=(i+1)-curr;
            int rig=count1-curr;
            count=Math.min(count,lef+rig);
        }
        return count;
    }
}