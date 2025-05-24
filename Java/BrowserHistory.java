import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

class BrowserHistory {

  public static void main(String[] args) {

    BrowserHistory browserHistory = new BrowserHistory();
    browserHistory.menu();

  }

  List<String> list = new LinkedList<>();
  int currentIndex = -1;

  public void menu() {

    Scanner sc = new Scanner(System.in);
    int cont =1;
    while(cont!=0){
      System.out.println("1.Search\n2.Forward\n3.Backward\n4.Display");
      System.out.println("Enter the operation you want to perform:");
      int op = sc.nextInt();
      switch (op) {
        case 1:
          search(sc);
          break;

        case 2:    
          currentIndex++;
          if (currentIndex>list.size()-1) {
            System.out.println("Cannot go forward");
            currentIndex--;
          }
          break;

        case 3:
          currentIndex--;
          if (currentIndex < -1) {
            System.out.println("Cannot go backward");
            currentIndex++;
          }
          break;

        case 4:
          display();
          break;
      }
    }
    System.out.println("Do you want to continue? (1 for yes, 0 for no)");
    cont = sc.nextInt();
  }

  public void display(){

    for(int i=0;i<=currentIndex;i++){
      System.out.println(list.get(i)+"->");
    }
    System.out.println("NULL");

  }

  public void search(Scanner sc) {
    while(list.size()-1>currentIndex){
      list.removeLast();
    }
    System.out.println("Enter the URL to search:");
    String url = sc.next();
    if (currentIndex < 9) {
      list.add(url);
      currentIndex++;
    } else {
      list.remove(0);
      list.add(url);
    }
  }


}
