//Given an array of integers nums and an integer k, 
//find the maximum element in each sliding window of size k as the window moves from left to right. 
//Return a list of these maximums
import java.util.Deque;
import java.util.ArrayList;
import java.util.LinkedList;
class Question_8{

  public static ArrayList<Integer> findMax(int[] arr, int k){

    Deque<Integer> deque = new LinkedList<>();
    ArrayList<Integer> res = new ArrayList<>();
    for(int i=0;i<arr.length;i++){
      int num = arr[i];
      //remove elements smaller than the current number from the deque
      while(!deque.isEmpty() && deque.getLast()<num){
        deque.pollLast();
      }
      deque.addLast(num);
      //remove elements which have moved out of the index
      if(i>=k && arr[i-k]==deque.getFirst()){
        deque.pollFirst();
      }
      //add the max element to the array 
      if(i>=k-1){
        res.add(deque.getFirst());
      }
    }

    return res;
  }

  public static void main(String[] args){

    Question_8 q8 = new Question_8();
    System.out.println(q8.findMax(new int[] {1,2,3,6,9,5},3));

  }

}
