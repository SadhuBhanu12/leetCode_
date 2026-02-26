class Solution {
    public int binaryGap(int n) {
       String str=Integer.toBinaryString(n);
       ArrayList<Integer> list=new ArrayList<>();
       for (int i=0;i<str.length();i++){
        if (str.charAt(i)=='1')list.add(i);
       } 
       int max=0;
       for (int i=0;i<list.size()-1;i++)max=Math.max(list.get(i+1)-list.get(i),max);
       return max;
    }
}