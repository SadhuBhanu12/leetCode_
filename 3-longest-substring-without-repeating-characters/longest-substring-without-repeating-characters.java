class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
    
            }
            else{
            l=Math.max(l,map.get(s.charAt(i))+1);
                map.put(s.charAt(i),i);

            }
                        count=Math.max(i-l+1,count);
        }
        return count;
    }
}