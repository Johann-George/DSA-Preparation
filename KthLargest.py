import heapq
class KthLargest:
    def FindKthLargest(self,nums,k):
#heapq.heappush(heap, item): Adds an item to the heap, maintaining heap property (O(log n)).

#heapq.heappop(heap): Removes and returns the smallest item, maintaining heap property (O(log n)).

#heap[0]: Peeks at the smallest item (O(1)).
        heap=[]
        #apply min heap using heapq
        for i in range(len(nums)):
            heapq.heappush(heap,nums[i])
        #finding the kth largest element
        for j in range(k):
            Kth_element=heapq.heappop(heap)
        return Kth_element

kth=KthLargest()
print(kth.FindKthLargest([5,7,3,2,1,5,6,3,4],2))
