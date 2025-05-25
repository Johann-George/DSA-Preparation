import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class TicketBooking {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Deque<String> queue = new ArrayDeque<>();
        System.out.println("Enter the number of people:");
        int no = sc.nextInt();
        for(int i=0;i<no;i++){
            sc.nextLine();
            boolean vip = false;
            System.out.println("Enter your name:");
            String name = sc.nextLine();
            System.out.println("Are you a vip:");
            vip = sc.nextBoolean();
            if(vip){
                queue.addFirst(name);
            }
            else{
                queue.addLast(name);
            }
        }
        System.out.println("The order of people are:");
        for(int i=0;i<no;i++){
            System.out.println(queue.poll());
        }
        sc.close();
    }

}
