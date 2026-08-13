class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max1=nums[0]
        curr_sum=nums[0]
        for i in range(1,len(nums)):
            curr_sum=max(nums[i],nums[i]+curr_sum)
            max1=max(curr_sum,max1)
        return max1