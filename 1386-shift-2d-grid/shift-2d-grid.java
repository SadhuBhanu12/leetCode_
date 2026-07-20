class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> res=new ArrayList<>();
        int m=grid.length-1;
        int n=grid[0].length-1;
        for(int i=0;i<k;i++){
            int temp=grid[m][n];
            int val=grid[m][n];
            while(m>=0){
                if(m==0 && n==0)break;
                 else if(n==0){
                    m--;
                    n=grid[0].length-1;
                    grid[m+1][0]=grid[m][n];
                }else{
                grid[m][n]=grid[m][n-1];
                    n--;
                }
                
            }
            grid[0][0]=temp;
            m=grid.length-1;
            n=grid[0].length-1;

        }
      for (int[] num : grid) {
    List<Integer> row = new ArrayList<>();
    for (int val : num) {
        row.add(val);
    }
    res.add(row);
}
        return res;

    }
}