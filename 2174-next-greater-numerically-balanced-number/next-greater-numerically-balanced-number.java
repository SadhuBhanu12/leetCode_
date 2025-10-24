class Solution {
    public int nextBeautifulNumber(int n) {
        for (int i=n+1;i<=1224444 ;i++){
            if (check(Integer.toString(i))){
                return i;
            }
        }
        return -1;
    }
    public boolean check(String a){
        HashMap<Character,Integer> map=new HashMap<>();
        for ( char ch:a.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:map.keySet()){
            if (Integer.parseInt(ch+"")!=map.get(ch))return false;
        }
        return true;
    }
}