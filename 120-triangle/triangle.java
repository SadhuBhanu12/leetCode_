class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size()==1)return triangle.get(0).get(0);
        if (triangle.size()==2)return Math.min(triangle.get(0).get(0)+triangle.get(1).get(0),triangle.get(0).get(0)+triangle.get(1).get(1));
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>(List.of(triangle.get(0).get(0))));
        list.add(new ArrayList<>(List.of(triangle.get(0).get(0)+triangle.get(1).get(0),triangle.get(0).get(0)+triangle.get(1).get(1))));
        for (int i=2;i<triangle.size();i++){
            List<Integer> pre=list.get(i-1);
            ArrayList<Integer> after=new ArrayList<>();
            after.add(pre.get(0)+triangle.get(i).get(0));
            for (int j=1;j<triangle.get(i).size()-1;j++){
                 after.add(triangle.get(i).get(j) + Math.min(pre.get(j-1), pre.get(j)));
            }
            after.add(pre.get(pre.size()-1)+triangle.get(i).get(triangle.get(i).size()-1));
            list.add(after);
        }
        System.out.println(list+"");
        int min=Integer.MAX_VALUE;
        int size1=list.size()-1;
        for (int i=0;i<list.get(list.size()-1).size();i++){
            min=Math.min(min,list.get(size1).get(i));
        }
return min;
    }
}