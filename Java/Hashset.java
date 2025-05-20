import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Hashset {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    HashSet<String> set = new HashSet<>();
    System.out.println("Enter the number of input:");
    int no = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < no; i++) {
      System.out.println("Enter your favourite programming language:");
      String lang = sc.nextLine();
      set.add(lang);
    }
    Iterator<String> iterator = set.iterator();
    System.out.println("The list of favourite programming languages is");
    while (iterator.hasNext()) {
      System.out.println(iterator.next()); 
    }
    sc.close();
  } 
}
