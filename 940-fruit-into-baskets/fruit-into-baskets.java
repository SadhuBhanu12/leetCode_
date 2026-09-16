class Solution {
    public int totalFruit(int[] fruits) {
 
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0;
        int count=0;
        for(int i=0;i<fruits.length;i++){
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            if(map.size()<=2){
                    count=Math.max(i-l+1,count);
                }
            while(map.size()>2 && l<i+1){
                int val=fruits[l];
                map.put(val,map.get(val)-1);
                if(map.get(val)==0)
    map.remove(val);
                l++;
            }
            }
            return count;
        
    }
}