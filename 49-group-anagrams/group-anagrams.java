class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char arr1[]=strs[i].toCharArray();
            Arrays.sort(arr1);
            String str=Arrays.toString(arr1).replace("[","").replace("]","").replace(",","").replace("\\s+","");
            if(!map.containsKey(str)){
                List<String> list1=new ArrayList<>();
                list1.add(strs[i]);
                map.put(str,list1);
            }
            else{
                List<String> l1=map.get(str);
                l1.add(strs[i]);
                map.put(str,l1);
            }
        }
        for(String str:map.keySet()){
            list.add(map.get(str));
        }
        return list;
    }
}