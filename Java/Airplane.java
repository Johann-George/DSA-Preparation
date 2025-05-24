import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;

class Passenger {

  String Name;
  int priority;

  public Passenger(String Name, int priority) {
    this.Name = Name;
    this.priority = priority;
  }

}

class Airplane {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    PriorityQueue<Passenger> queue = new PriorityQueue<>(new Comparator<Passenger>() {
      public int compare(Passenger a, Passenger b) {
        return Integer.compare(a.priority, b.priority);
      }
    });
    System.out.println("Enter the number of passengers:");
    int no = sc.nextInt();
    for (int i = 0; i < no; i++) {
      sc.nextLine();
      System.out.println("Enter the passenger name:");
      String name = sc.nextLine();
      System.out.println("Enter the passenger priority:");
      int priority = sc.nextInt();
      Passenger passenger = new Passenger(name, priority);
      queue.add(passenger);
    }
    System.out.println("Boarding order");
    while (!queue.isEmpty()) {
      System.out.println("Passenger Name:" + queue.poll().Name);
    }
    sc.close();
  }

}
