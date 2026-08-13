class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
           char arr1[]=strs[i].toCharArray();
            Arrays.sort(arr1);
            String str1 =new String(arr1);
            if(map.containsKey(str1)){
                map.get(str1).add(strs[i]);
            }
            else {
                map.put(str1, new ArrayList<>());
                map.get(str1).add(strs[i]);
            }
        }
        for(String i:map.keySet()){
            res.add(map.get(i));
        }
        return res;
    }
}