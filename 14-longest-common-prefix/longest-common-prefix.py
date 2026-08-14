class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        strs.sort()
        s=""
        for i in range(0,min(len(strs[0]),len(strs[len(strs)-1]))):
            if(strs[0][i]==strs[len(strs)-1][i]):
                s=s+strs[0][i]
            else: break
        return s
