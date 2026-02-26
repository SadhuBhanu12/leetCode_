class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        list.add(new int[]{intervals[0][0],intervals[0][1]});
       for (int i=1;i<intervals.length;i++){
            int n11=list.get(list.size()-1)[0];
            int n12=list.get(list.size()-1)[1];
            int n21=intervals[i][0];
            int n22=intervals[i][1];
            if (n12>=n21 && n12>=n22){
                continue;
            }
            else if (n12>=n21 && n22>=n12){
                list.remove(list.size()-1);
                list.add(new int[]{n11,n22});
            }
            else list.add(new int[]{n21,n22});
       } 
       int arr[][]=new int[list.size()][2];
       for (int i=0;i<list.size();i++){
        arr[i][0]=list.get(i)[0];
        arr[i][1]=list.get(i)[1];
       }
       return arr;
    }
}