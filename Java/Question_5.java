import java.util.PriorityQueue;
class Question_5{

  public static int KthLargest(int[] nums,int k){
    int Kth=0;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();  
    for(int i=0;i<nums.length;i++){
      minHeap.add(nums[i]);
    }
    for(int i=0;i<=nums.length-k;i++){
      Kth=minHeap.poll();
    }
    return Kth;

  }  

  public static void main(String[] args){

    Question_5 q5 = new Question_5();
    System.out.println(q5.KthLargest(new int[]{-2,4,2,1,5},2));

  }

}
