import java.util.Scanner;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Comparator;

class Book {

  String book;
  double price;

  public Book(String book, double price) {
    this.book = book;
    this.price = price;
  }

}

class ArrayListManipulation {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Book> list = new ArrayList<>(); // input all the books inside the list
    for (int i = 0; i < 5; i++) {
      System.out.println("Enter the book:");
      String title = sc.nextLine();
      System.out.println("Enter the price:");
      double price = sc.nextDouble();
      Book bookObj = new Book(title, price);
      list.add(bookObj);
      sc.nextLine();
    }
    list.sort(new Comparator<Book>() {
      public int compare(Book b1, Book b2) {
        return Double.compare(b1.price, b2.price);
      }
    });
    ListIterator<Book> iterator = list.listIterator();
    // remove the chepeast book
    if (iterator.hasNext()) {
      iterator.next();
      iterator.remove();
    }
    // display the list 

    for(Book book : list){
      System.out.println("Book name:" + book.book + " Book price:" + book.price);
    }
    sc.close();
    }

}

