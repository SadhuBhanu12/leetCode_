class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
         
            max=Math.max(Math.abs(r-l)*Math.min(height[l],height[r]),max);
            if (height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
    }
    return max;
    }
}