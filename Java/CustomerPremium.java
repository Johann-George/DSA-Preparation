/*Problem Statement: Equifax wants to identify customers with 
frequent high-value transactions for premium services. 
Given a list of customer transactions and a minimum amount threshold, 
write a Java program to: 
Filter transactions above the threshold.
Identify customers with at least a specified number of such transactions (minCount).
Return the results sorted by transaction count (descending) 
and total amount (descending for ties).*/
import java.util.*;


public class CustomerPremium{

  private static Map<String, Integer> freqMap = new HashMap<>();
  private static Map<String, Double> totalMap = new HashMap<>();
  private static Map<String, Integer> sortedFreqMap = new LinkedHashMap<>();
  private static Map<String, Double> sortedTotalMap = new LinkedHashMap<>();

  public Map<String, Double> filterTransactions(List<Transaction> transactions, Integer threshold, Integer minCount){

    for(Transaction transaction : transactions){
      //finding customers above the threshold and their frequency
      if(transaction.getAmount()>threshold){
        freqMap.put(transaction.getCustomerId(), freqMap.getOrDefault(transaction.getCustomerId(),0)+1);
        totalMap.put(transaction.getCustomerId(), totalMap.getOrDefault(transaction.getCustomerId(),0.0)+transaction.getAmount());
      }
    }

    Iterator<Map.Entry<String, Integer>> mIt = freqMap.entrySet().iterator();
    while (mIt.hasNext()) {
      Map.Entry<String, Integer> entry = mIt.next();
      if(entry.getValue()<minCount){
        mIt.remove();
        totalMap.remove(entry.getKey());
      }
    }

    List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(freqMap.entrySet());
    sortedList.sort((e1,e2) -> Integer.compare(e2.getValue(), e1.getValue()));

    for(Map.Entry<String, Integer> entry: sortedList){
      sortedFreqMap.put(entry.getKey(), entry.getValue());
      sortedTotalMap.put(entry.getKey(), totalMap.get(entry.getKey()));
    }

    return sortedTotalMap;

  }

}
