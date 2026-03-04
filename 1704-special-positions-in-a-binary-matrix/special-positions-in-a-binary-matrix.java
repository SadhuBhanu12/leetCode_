class Solution {
    public int numSpecial(int[][] mat) {
       int arr1[]=new int[mat.length];
       int arr2[]=new int[mat[0].length];
       for (int i=0;i<mat.length;i++){
        for (int j=0;j<mat[0].length;j++){
            arr1[i]+=mat[i][j];
            arr2[j]+=mat[i][j];
        }
       }
       int count=0;
      for (int i=0;i<mat.length;i++){
        for (int j=0;j<mat[i].length;j++){
            if (mat[i][j]==1 && arr1[i]==1 && arr2[j]==1)count++;
        }
      }
       return count;
        
    }
}