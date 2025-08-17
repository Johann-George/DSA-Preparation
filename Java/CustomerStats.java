import java.time.LocalDate;

public class CustomerStats{

  private Double minAmount;
  private Double maxAmount;
  private LocalDate minDate;
  private LocalDate maxDate;

  public CustomerStats(){
    this.minAmount = Double.MAX_VALUE;
    this.maxAmount = Double.MIN_VALUE;
    this.minDate = null;
    this.maxDate = null;
  }

  public void update(Transaction t){
    if(this.minAmount > t.getAmount()){
      this.minAmount = t.getAmount();
      this.minDate = t.getDate();
    }
    else if (this.maxAmount < t.getAmount()) {
      this.maxAmount = t.getAmount();
      this.maxDate = t.getDate();
    }
  }

  public Double getRange(){
    return this.maxAmount - this.minAmount;
  }

  public Double getMinAmount(){
    return this.minAmount;
  }

  public LocalDate getMinDate(){
    return this.minDate;
  }

  public LocalDate getMaxDate(){
    return this.maxDate;
  }

}
