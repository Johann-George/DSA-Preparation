import java.util.*;

public class CustomerTopN{

  //have a hashmap that can store the no of transactions of each cusotmer
  //another hashmap that can store the total amount of each customer
  //return the top N customers with most transactions
  //include total transaction amount for each customer in the output

  public Map<String, Double> filterTransactions(List<Transaction> transactions, Integer topN){

    Map<String, Integer> transNoMap = new HashMap<>();
    Map<String, Double> filterMap = new HashMap<>();

    for(Transaction transaction : transactions){
      transNoMap.put(transaction.getCustomerId(), transNoMap.getOrDefault(transaction.getCustomerId(),0)+1);
      filterMap.put(transaction.getCustomerId(), filterMap.getOrDefault(transaction.getCustomerId(),0.0)+ transaction.getAmount());
    }

    //list to sort the customers acc to no of transactions
    List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(transNoMap.entrySet());
    sortedList.sort((e1,e2)-> {
      int cmp = Integer.compare(e2.getValue(), e1.getValue());
      if(cmp == 0){
        return e1.getKey().compareTo(e2.getKey());
      }
      return cmp;
    });

    //topN customers stored in a LinkedHashMap
    Map<String, Integer> sortedMap = new LinkedHashMap<>();
    for(Map.Entry<String, Integer> entry: sortedList){
      if(sortedMap.size()<topN){
        sortedMap.put(entry.getKey(), entry.getValue());
      }
    }

    Map<String, Double> topNMap = new LinkedHashMap<>();
    for(Map.Entry<String, Integer> entry: sortedMap.entrySet()){
      topNMap.put(entry.getKey(),filterMap.get(entry.getKey()));
    }

    return topNMap;

  }

}
