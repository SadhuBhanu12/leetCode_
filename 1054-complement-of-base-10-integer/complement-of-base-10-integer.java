class Solution {
    public int bitwiseComplement(int n) {
        if (n==1)return 0;
        if (n==0)return 1;
        String a=Integer.toBinaryString(n);
        StringBuilder sb=new StringBuilder();
        for (char a1:a.toCharArray()){
            if (a1=='0')sb.append("1");
            else sb.append("0");
        }
        return Integer.parseInt(sb.toString(),2);
    }
}