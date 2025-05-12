class Solution(object):
    def findEvenNumbers(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        a=[]
        for i in range(100,1000):
            if self.iscontains(i,digits) and i%2==0:
                a.append(i)
        return a
    def iscontains(self,num,digits):
        a1=[0]*10
        for num1 in digits:
            a1[num1]+=1
        while num>0:
            temp=num%10
            if a1[temp]==0:
                return False
            a1[temp]-=1
            num=num//10
        return True
       
        
            


        