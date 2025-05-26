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
                //if vip then add them to the front row
                queue.addFirst(name);
            }
            else{
                //if not vip then add them to the back
                queue.addLast(name);
            }
        }
        System.out.println("The order of people are:");
        //Display the order of customers
        for(int i=0;i<no;i++){
            System.out.println(queue.poll());
        }
        sc.close();
    }

}
