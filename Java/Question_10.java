import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Map;
class Question_10{

  public static ArrayList<Integer> findKth(int[] nums,int k){

    HashMap<Integer,Integer> map = new HashMap<>();
    ArrayList<Integer> list = new ArrayList<>();
    //store the frequency count of each element in a hash map
    for(int i=0;i<nums.length;i++){
      map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    } 
    
    // store the map in a priority queue
    PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(Map.Entry.comparingByValue());

    //Keep the k most frequent elements
    for(Map.Entry<Integer,Integer> entry: map.entrySet()){
      pq.offer(entry);
      if(pq.size()>k){
        pq.poll();
      }
    }

    // store the k most frequent elements in an array and return it 
    while(!pq.isEmpty()){
      list.add(pq.poll().getKey());
    } 
    return list;
    
  }

  public static void main(String[] args) {
    
    Question_10 q10 = new Question_10();
    System.out.println(q10.findKth(new int[] {1, 1, 1, 2, 2, 3}, 2));

  }

}
