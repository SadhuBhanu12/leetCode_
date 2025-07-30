class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for (int i=0;i<numRows;i++){
             List<Integer> sublist1=new ArrayList<>();
            for (int j=0;j<=i;j++){
          
            if (j==0|| j==i){
                sublist1.add(1);
                
            }
            else{
                int count=res.get(i-1).get(j)+res.get(i-1).get(j-1);
                sublist1.add(count);
                
            }
            }
           res.add(sublist1);
            
          
        }
        return res;
    }
}