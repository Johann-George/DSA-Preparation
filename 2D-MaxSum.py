class MaxSum:
    def calMaxSum(self,nums):
        maxSum=float("-inf")
        for left in range(len(nums[0])):
            temp=[0]*len(nums)
            for right in range(left,len(nums[0])):
                for i in range(len(nums)):
                    temp[i]+=nums[i][right]
                    
                cur_sum=self.kadane(temp)
                maxSum=max(cur_sum,maxSum)

        return maxSum
    
    def kadane(self,arr):
        local_sum=arr[0]
        global_sum=arr[0]
        for i in range(1,len(arr)):
            local_sum=max(arr[i],local_sum+arr[i])
            global_sum=max(local_sum,global_sum)
        return global_sum

ms=MaxSum()
print(ms.calMaxSum([
    [2, -1, 4],
    [-3, 5, -2]
]))


