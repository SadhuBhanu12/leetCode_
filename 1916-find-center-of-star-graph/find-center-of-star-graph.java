class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int []e:edges){
            map.put(e[0],map.getOrDefault(e[0],0)+1);
                map.put(e[1],map.getOrDefault(e[1],0)+1);
        }
        int max=0;
        int val=0;
        for(int e:map.keySet()){
            if(map.get(e)>=max){
                max=map.get(e);
                val=e;
            }
        }
        return val;
    }
}