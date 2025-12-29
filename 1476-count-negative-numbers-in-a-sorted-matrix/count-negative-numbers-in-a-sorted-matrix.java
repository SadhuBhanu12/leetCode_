class Solution {
    public int countNegatives(int[][] grid) {
        String a=Arrays.deepToString(grid);
        int c=0;
        for(char a1:a.toCharArray()){
            if (a1=='-')c++;
        }
        return c;
    }
}