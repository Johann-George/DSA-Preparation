import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Comparator;

class SocialMedia {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    HashSet<String> set = new HashSet<>();
    System.out.println("Enter the number of hashtags:");
    int no = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < no; i++) {
      System.out.println("Enter the hashtag:");
      String hashtag = sc.nextLine();
      set.add(hashtag);
    }
    List<String> list = new ArrayList<>(set);
    list.sort(new Comparator<String>() {
      public int compare(String a, String b) {
        return a.compareTo(b);
      }
    });
    System.out.println("The trending hashtags in alphabetical order is:");
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    sc.close();
  }

}
