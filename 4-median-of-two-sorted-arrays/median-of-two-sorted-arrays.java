class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double arr[]=new double[nums1.length+nums2.length];
        int c=0;
        for (int i: nums1){
            arr[c++]=i;
        }
        for (int i:nums2){
            arr[c++]=i;
        }
        Arrays.sort(arr);
        return (arr.length%2==0)?((arr[(arr.length/2)-1])+(arr[arr.length/2]))/2:arr[arr.length/2];
    }
}