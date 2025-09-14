class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        for (int i=0;i<nums1.length;i++){
            list1.add(nums1[i]);
        }
        for (int i=0;i<nums2.length;i++){
            list2.add(nums2[i]);
        }
    for (int i=0;i<list1.size();i++){
        if(list2.contains(list1.get(i))){
            list3.add(list1.get(i));
            list2.remove(list1.get(i));}

    }
    int arr[]=new int[list3.size()];
    for (int i=0;i<arr.length;i++){
        arr[i]=list3.get(i);
    }
    return arr;
    }
}