class Solution {
    public String largestGoodInteger(String num) {
        int a=000;
        String a1="";
        for (int i=0;i<num.length()-2;i++){
            if ((num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+1) && num.charAt(i+2)==num.charAt(i)) && (Integer.parseInt(num.substring(i,i+3))>=a)){
                a=Integer.parseInt(num.substring(i,i+3));
                a1=num.substring(i,i+3);
            }
        }
        return a1;
    }
}