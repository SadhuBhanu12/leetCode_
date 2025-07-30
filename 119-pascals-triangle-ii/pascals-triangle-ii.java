class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        for (int i=0;i<rowIndex+1;i++){
            ArrayList<Integer> res=new ArrayList<>();
            for (int j=0;j<=i;j++){
                if (j==0||j==i){
                    res.add(1);
                }
                else{
                    int count=a.get(i-1).get(j)+a.get(i-1).get(j-1);
                    res.add(count);
                }

            }
            a.add(res);
        }
        return (a.size()>0)?a.get(a.size()-1):new ArrayList(1);
    }
}