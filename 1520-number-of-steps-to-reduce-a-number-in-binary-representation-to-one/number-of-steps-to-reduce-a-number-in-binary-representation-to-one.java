class Solution {
    public int numSteps(String s) {
        int count=0;
        int car=0;
        for (int i=s.length()-1;i>=1;i--){
            int num=s.charAt(i)-'0';
            if (car+num==1){
                count+=2;
                car=1;
            }
            else{
                count++;
            }
        }
        return car+count;
    }
}