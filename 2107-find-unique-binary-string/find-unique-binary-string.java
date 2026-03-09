class Solution {
    public String findDifferentBinaryString(String[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int max=0;

        for(int i=0;i<nums.length;i++){
            int val=Integer.parseInt(nums[i],2);
            list.add(val);
            max=Math.max(val,max);
        }

        String num="";
        for(int i=0;i<=max+1;i++){
            if(!list.contains(i)){
                num=Integer.toBinaryString(i);
                break;
            }
        }

        int len=num.length();

        while(len<nums[0].length()){
            num="0"+num;
            len++;
        }

        return num;
    }
}