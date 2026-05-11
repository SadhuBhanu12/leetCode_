class Solution {
    public int[] separateDigits(int[] nums) {
        String a=Arrays.toString(nums).replace(",","").replace("[","").replace("]","").replaceAll("\\s+","");
        System.out.println(a);
        int arr1[]=new int[a.length()];
        int i=0;
        for (char c1:a.toCharArray()){
            arr1[i++]=(c1-'0');
        }
        return arr1;
    
    }
}