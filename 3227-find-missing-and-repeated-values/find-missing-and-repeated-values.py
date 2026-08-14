class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        ls=[-1]*(len(grid)*(len(grid[0])+1))
        for i in range(0,len(grid)):
            for j in range(0,len(grid)):
                ls[grid[i][j]]=ls[grid[i][j]]+1
        ls1=[-1]*2
        print(ls)
        for i in range(1,len(ls)):
            if ls[i]==-1:
                ls1[1]=i
                break
        for i in range(1,len(ls)):
            if ls[i]>=1:
                ls1[0]=i
                break
        return ls1
