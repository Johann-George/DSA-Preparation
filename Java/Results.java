import java.time.LocalDate;

public class Results{

  private String customerId;
  private Double range;
  private LocalDate minDate;
  private LocalDate maxDate;

  public Results(String customerId, CustomerStats cs){
    this.customerId = customerId;
    this.range = cs.getRange();
    this.minDate = cs.getMinDate();
    this.maxDate = cs.getMaxDate();
  }

  public String getCustomerId(){
    return this.customerId;
  }

  public Double getRange(){
    return this.range;
  }

}
