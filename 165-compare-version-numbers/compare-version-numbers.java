class Solution {
    public int compareVersion(String version1, String version2) {
        String arr1[]=version1.split("\\.");
        String arr2[]=version2.split("\\.");
        int arr11[]=new int[Math.max(arr1.length,arr2.length)];
        int arr12[]=new int[Math.max(arr1.length,arr2.length)];
        for (int i=0;i<arr1.length;i++)arr11[i]=Integer.parseInt(arr1[i]);
        for (int i=0;i<arr2.length;i++)arr12[i]=Integer.parseInt(arr2[i]);
        for (int i=0;i<arr11.length;i++){
            if (arr11[i]>arr12[i])return 1;
            if (arr12[i]>arr11[i])return -1;
        }
        return 0;

    }
}