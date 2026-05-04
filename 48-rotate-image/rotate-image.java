class Solution {
    public void rotate(int[][] matrix) {
        ArrayList<List<Integer>> list=new ArrayList<>();
        for (int i=0;i<matrix.length;i++){
            List<Integer> list1=new ArrayList<>();
            for (int j=0;j<matrix[i].length;j++){
                list1.add(matrix[i][j]);
            }
            list.add(list1);
        }
    
    for(int i=0;i<list.size();i++){
        for (int j=0;j<list.get(i).size();j++){
            matrix[i][j]=list.get(list.size()-j-1).get(i);
        }
    }
    }
}