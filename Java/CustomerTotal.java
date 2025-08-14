import java.util.*;

public class CustomerTotal{

  HashMap<String, Double> map = new HashMap<>();
  
  public Map<String, Double> filterTransactions(List<Transaction> transactions, Double threshold){

    Map<String, Double> map = new HashMap<>();
    
    //adding amounts of each customer
    for(Transaction transaction: transactions){
      String custId = transaction.getCustomerId();
      Double amount = transaction.getAmount();

      if(map.containsKey(custId)){
        map.put(custId, map.get(custId)+amount);
      }
      else{
        map.put(custId, amount);
      }
    }
    
    //storing the map contents to a list to sort by amount
    List<Map.Entry<String, Double>> list = new ArrayList<>(map.entrySet());
    list.sort((e1,e2)-> Double.compare(e2.getValue(), e1.getValue()));

    //Enter customer whose amount greater than threshold
    Map<String, Double> filterMap = new LinkedHashMap<>();
    for(Map.Entry<String, Double> entry: list){
      if(entry.getValue()>threshold){
        filterMap.put(entry.getKey(),entry.getValue());
      }
    }
    return filterMap;
  }

}
