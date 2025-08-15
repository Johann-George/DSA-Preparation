import java.util.*;
import java.time.LocalDate;


public class EquifaxCodingTest{

  public static void main(String[] args){
    List<Transaction> transactions = Arrays.asList(
      new Transaction("C001", 1500.50, LocalDate.of(2025, 1, 15)),
      new Transaction("C002", 800.25, LocalDate.of(2025, 2, 10)),
      new Transaction("C001", 2000.75, LocalDate.of(2025, 3, 20)),
      new Transaction("C003", 1200.00, LocalDate.of(2025, 4, 5)),
      new Transaction("C002", 3000.00, LocalDate.of(2025, 5, 12)),
      new Transaction("C004", 3500.00, LocalDate.of(2025, 5, 12)),
      new Transaction("C004", 2600.00, LocalDate.of(2025, 5, 12))
    );

    CustomerPremium cp = new CustomerPremium();
    Map<String, Double> map = new LinkedHashMap<>(cp.filterTransactions(transactions, 1500, 2));
    for(Map.Entry<String, Double> entry: map.entrySet()){
      System.out.println("Customer ID:"+entry.getKey()+" Customer Amount:"+entry.getValue());
    }
    
  }

}
