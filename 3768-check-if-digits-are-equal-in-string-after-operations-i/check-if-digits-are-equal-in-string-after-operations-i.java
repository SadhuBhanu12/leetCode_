class Solution {
    public boolean hasSameDigits(String s) {
        if (s.length()<2){
            return true;
        }
    int len=s.length();
       while(len>=2){
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<s.length()-1;i++){
            int a1=((s.charAt(i)-'0')+(s.charAt(i+1)-'0'))%10;
            sb.append(Integer.toString(a1));
        }
        s=sb.toString();
        len=s.length()-1;
        System.out.println(s);
       }
       return s.charAt(0)==s.charAt(1);
    }
}