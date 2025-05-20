import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;

class Treeset {

  public static void main(String[] args) {
    TreeSet<String> set = new TreeSet<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of students:");
    int no = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < no; i++) {
      System.out.println("Enter the name of the student:");
      String name = sc.nextLine();
      set.add(name);
    }
    Iterator<String> iterator = set.iterator();
    System.out.println("The list of students in alphabetical order is");
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    sc.close();
  }

}
