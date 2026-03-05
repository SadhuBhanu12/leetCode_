class Solution {
    public int minOperations(String s) {
        String a1="";
        String a2="";
        for (int i=0;i<s.length();i++){
            if (i%2==0){
                a1+="1";
                a2+="0";
            }
            else{
                a1+="0";
                a2+="1";
            }
        }
        int count1=0;
        int count2=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==a1.charAt(i))count1++;
            if (s.charAt(i)==a2.charAt(i))count2++;
        }
        return Math.min(count1,count2);
    }
}