class TrappingRainWater:
    def Trapping(self,nums):
        lb,rb=0,len(nums)-1
        #intialize max left and max right to 0
        maxLb,maxRb=0,0
        #intialize water level to 0
        wl=0
        while(lb<rb):
            #check the max left block
            maxLb=max(maxLb,nums[lb])
            #check the max right block
            maxRb=max(maxRb,nums[rb])
            #if max value of left block is less than right block then add water level and increment left block by 1
            if maxLb<maxRb:
                wl+=maxLb-nums[lb]
                lb+=1
            else:
                wl+=maxRb-nums[rb]
                rb-=1
        return wl
        
tp=TrappingRainWater()
print(tp.Trapping([4,2,0,3,2,5]))

