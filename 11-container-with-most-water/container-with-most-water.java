class Solution {
    public int maxArea(int[] height) {
        int total=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
           
            int max1=Math.min(height[l],height[r]);
            total=Math.max(total,(max1)*(r-l));
            if(height[l]<height[r])l++;
else r--;
        }
        return total;
    }
}