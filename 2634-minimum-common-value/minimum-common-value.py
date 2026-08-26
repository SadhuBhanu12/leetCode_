class Solution(object):
    def getCommon(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: int
        """
        
        ls = list(set(nums1) & set(nums2))
        val=float('inf')
        if(len(ls)==0):
            return -1
        print(ls)
        for i in range(0,len(ls)):
            if ls[i]<val:
                val=ls[i]
        if val==float('-inf'):
            return -1
        return val