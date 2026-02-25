class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
       TreeMap<Integer,List<Integer>> map=new TreeMap<>();
       for (int i=0;i<arr.length;i++){
        String num=Integer.toBinaryString(arr[i]);
        int count =(int) num.chars().filter(ch -> ch == '1').count();
        if (map.containsKey(count)){
            List<Integer> get1=map.get(count);
            get1.add(arr[i]);
            map.put(count,get1);
        }
        else{
            List<Integer> list=new ArrayList<>();
            list.add(arr[i]);
            map.put(count,list);
        }
       } 
       int c=0;
      for (int i:map.keySet()){
        List<Integer> res=map.get(i);
        for (int j=0;j<res.size();j++){
            arr[c++]=res.get(j);
        }
      }
    
       return arr;
    }
}