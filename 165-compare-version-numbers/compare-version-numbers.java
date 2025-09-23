class Solution {
    public int compareVersion(String version1, String version2) {
        String arr1[]=version1.split("\\.");
          String arr2[]=version2.split("\\.");
          int c=0;
          for (int i=0;i<Math.max(arr1.length,arr2.length);i++){
           int a1 = (i < arr1.length) ? Integer.parseInt(arr1[i]) : 0;
            int a2 = (i < arr2.length) ? Integer.parseInt(arr2[i]) : 0;
            System.out.println(a1+"  "+a2);
            if (a1>a2)return  1;
            else if (a2>a1)return -1;
            else if (a1==a2)c++; 
          }
          
          if(arr1.length>arr2.length){
            for (int i=c;i<arr1.length;i++){
                if (Integer.parseInt(arr1[i])!=0)return 1;
            }
          }
          if(arr2.length>arr1.length){
            for (int i=c;i<arr2.length;i++){
                if (Integer.parseInt(arr2[i])!=0)return -1;
            }
          }
          return 0;
    }
}