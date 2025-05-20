import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Iterator;

class LinkedHashset {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedHashSet<String> set = new LinkedHashSet<>();
    System.out.println("Enter the number of search terms:");
    int no = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < no; i++) {
      System.out.println("Search the term:");
      String term = sc.nextLine();
      set.add(term);
    }
    System.out.println("The search terms are:");
    Iterator<String> iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    sc.close();
  }

}
