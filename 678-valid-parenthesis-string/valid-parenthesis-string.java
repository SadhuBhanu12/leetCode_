class Solution {
    public boolean checkValidString(String s) {
        int min_balance=0;
        int max_balance=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='('){
                min_balance+=1;
                max_balance+=1;
            }
            else if (s.charAt(i)==')'){
                min_balance=Math.max(0,min_balance-1);
                max_balance-=1;
            }
             else {
                min_balance=Math.max(0,min_balance-1);
                max_balance+=1;
            }
            if (max_balance<0){
                return false;
            }

        }
        return min_balance==0;
        
    }
}