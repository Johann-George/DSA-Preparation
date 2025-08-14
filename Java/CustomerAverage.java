import java.util.*;
import java.time.LocalDate;

public class CustomerAverage{

  public Map<String, Double> filterTransactions(List<Transaction> transactions){

    Map<String, Integer> freqMap = new HashMap<>();
    Map<String, Double> avgMap = new HashMap<>();

    //calculate frequency of each customer ID and store in freqMap
    //store the total amount of each customer in avgMap
    for(Transaction transaction: transactions){
      if(transaction.getDate().isAfter(LocalDate.of(2025,4,5))|| transaction.getDate().isEqual(LocalDate.of(2025,4,5))){
        freqMap.put(transaction.getCustomerId(), freqMap.getOrDefault(transaction.getCustomerId(),0)+1);
        if(avgMap.containsKey(transaction.getCustomerId())){
          avgMap.put(transaction.getCustomerId(), avgMap.get(transaction.getCustomerId())+transaction.getAmount());
        }
        else{
          avgMap.put(transaction.getCustomerId(), transaction.getAmount());
        }
      }
    }

    for(Map.Entry<String, Double> entry : avgMap.entrySet()){
      avgMap.put(entry.getKey(), (entry.getValue()/freqMap.get(entry.getKey())));
    }

    List<Map.Entry<String, Double>> sortedList = new ArrayList<>(avgMap.entrySet());
    sortedList.sort((e1,e2)-> Double.compare(e2.getValue(), e1.getValue()));

    Map<String, Double> finalMap = new LinkedHashMap<>();
    for(Map.Entry<String, Double> entry : sortedList){
      finalMap.put(entry.getKey(), entry.getValue());
    }

    return finalMap;

  }

}
