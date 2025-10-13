class Solution {
    public void rotate(int[][] matrix) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int c=0;
        
        for (int i=0;i<matrix.length;i++){
            ArrayList<Integer> list1=new ArrayList<>();
            for (int j=0;j<matrix[i].length;j++){
                list1.add(matrix[i][j]);
            }
            list.add(list1);
        }
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                matrix[i][j]=list.get(list.size()-1-j).get(i);
            }
        }
        
    }
}