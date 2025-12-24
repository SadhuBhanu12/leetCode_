class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int min=capacity.length;
        int sum1=0;
        for (int i=0;i<apple.length;i++)sum1+=apple[i];
        Arrays.sort(capacity);
        for (int i=0;i<capacity.length;i++){
            int sum=0;
            for (int j=i;j<capacity.length;j++){
                sum+=capacity[j];
                if (min>(j-i+1) && sum1<=sum )min=(j-i+1);
            }
        }
        return min;
    }
}