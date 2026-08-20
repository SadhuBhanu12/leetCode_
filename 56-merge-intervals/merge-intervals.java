class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> list=new ArrayList<>();
        list.add(new int[]{intervals[0][0],intervals[0][1]});
        for(int i=1;i<intervals.length;i++){
            System.out.println("bhanu");
            int n21=intervals[i][0];
            int n22=intervals[i][1];
         
            int n12=list.get(list.size()-1)[1];
            if(n21<=n12){
                
                list.get(list.size() - 1)[1] = Math.max(n12, n22);
            
            }
        
            else{
                list.add(new int[]{n21,n22});
            }
        }
    int[][] arr = new int[list.size()][2];

for (int i = 0; i < list.size(); i++) {
    for (int j = 0; j < 2; j++) {
        arr[i][j] = list.get(i)[j];
    }
}
return arr;
    }
}