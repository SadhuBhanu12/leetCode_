class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a=new ArrayList<>();
        
        for (int i=0;i<numRows;i++){
            List<Integer> a1=new ArrayList<>();
              if (i==0){
                a1.add(1);
                a.add(a1);
            }else if (i==1){
                a1.add(1);
                a1.add(1);
                a.add(a1);
                }else{
            a1.add(1);
            for (int j=1;j<i;j++){
               a1.add(a.get(i-1).get(j-1)+a.get(i-1).get(j)); 
            }
            a1.add(1);
            a.add(a1);
            }
        }
        return a;
    }
}