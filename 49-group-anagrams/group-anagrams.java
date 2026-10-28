class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> list=new ArrayList<>();
       HashMap<String,List<String>> map=new HashMap<>();
       for(int i=0;i<strs.length;i++){
        char []arr=strs[i].toCharArray();
        Arrays.sort(arr);
        String str=new String(arr);
        if(!map.containsKey(str)){
            List<String> new1=new ArrayList<>();
            new1.add(strs[i]);
            map.put(str,new1 );
        }
        else{
            map.get(str).add(strs[i]);
        }
       } 
       for(String a1:map.keySet()){
        list.add(map.get(a1));
       }
       return list;
    }
}