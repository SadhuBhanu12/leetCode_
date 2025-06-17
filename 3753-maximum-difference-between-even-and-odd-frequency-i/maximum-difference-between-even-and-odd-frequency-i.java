class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> a=new HashMap<>();
        for (char a1:s.toCharArray()){
            a.put(a1,a.getOrDefault(a1,0)+1);
        }
        int max=0;
        int min=Integer.MAX_VALUE;
        for (char a1:s.toCharArray()){
            if (a.get(a1)>max && a.get(a1)%2==1) max=a.get(a1);
            else if (a.get(a1)<min && a.get(a1)%2==0) min=a.get(a1);
        }
        return max-min;
    }
}