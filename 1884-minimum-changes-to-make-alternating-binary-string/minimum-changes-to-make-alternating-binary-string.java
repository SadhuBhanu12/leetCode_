class Solution {
    public int minOperations(String s) {
        char a1='0';
        char a2='1';
        int count1=0;
        int count2=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!=a1){
                count1++; 
            }
            if (s.charAt(i)!=a2){
                count2++; 
            }
             if (a1=='0')a1='1';
             else a1='0';
             if (a2=='0')a2='1';
             else a2='0';
        }
        return Math.min(count1,count2);
    }
}