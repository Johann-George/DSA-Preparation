class Maxvalue:
    def calMaxValue(self,nums):
        maxSum=float("-inf")
        for i in range(len(nums)):
            sum=0
            for j in range(i,len(nums)+i):
                if sum>=0:
                    sum+=nums[j%len(nums)]
                else:
                    sum=nums[j%len(nums)]
                maxSum=max(maxSum,sum)
        return maxSum

maxVal=Maxvalue()
print(maxVal.calMaxValue([1,-2,-3,4]))
