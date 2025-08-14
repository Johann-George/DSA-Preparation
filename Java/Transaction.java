import java.time.LocalDate;

//Encapsulate Transaction data in a structured way
public class Transaction{

  //fields
  private String customerId;
  private Double amount;
  private LocalDate date;

  //default constructor
  public Transaction(){

  }

  //parametrized constructor
  public Transaction(String customerId, Double amount, LocalDate date){
    this.customerId = customerId;
    this.amount = amount;
    this.date = date;
  }

  //getters and setters

  public String getCustomerId(){
    return this.customerId;
  }

  public Double getAmount(){
    return this.amount;
  }

  public LocalDate getDate(){
    return this.date;
  }

  //override toString
  @Override
  public String toString(){
    return String.format("Customer %s: Amount = %.2f", customerId, amount);
  }

}
