class Maxvalue:
	def findMax(self,nums):		
		maxSum=0
		for i in range(len(nums)):
			sum=0
			for j in range(i,len(nums)):
				sum+=nums[j]
				maxSum=max(maxSum,sum)
		return maxSum
		
maxval=Maxvalue()
maxval.findMax([-1,3,4,-2])