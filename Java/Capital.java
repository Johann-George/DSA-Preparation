import java.util.*;

public class Capital{

  public static void main(String[] args) {
    int i=1;
    int correct=0;
    Scanner sc = new Scanner(System.in);
    List<String[]> arr = new ArrayList<String[]>();
    //add the state and capitals in arraylist
    while(i<29){
      arr.add(new String[]{"State "+i, "Capital "+i});
      i++;
    }
    //check whether entered capital is correct 
    for(i=0;i<28;i++) {
      String State = arr.get(i)[0];
      System.out.println("Enter the capital of "+State); 
      String capital = sc.nextLine();
      if(arr.get(i)[1].equals(capital)){
        correct+=1;
      }
    }

    System.out.println("The number of correct options is "+correct);
  }

}
