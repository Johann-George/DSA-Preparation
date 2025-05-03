class Kadane_algo:
	def maxVal(self,nums):
		sum=nums[0]
		maxSum=nums[0]
		for i in range(len(nums):
			if sum>=0:
				sum+=nums[i]
			else:
				sum=nums[i]
			maxSum=max(maxSum,sum)
		return maxSum

kadane=Kadane_algo()
kadane.maxVal([-1,-2,-15,-4])