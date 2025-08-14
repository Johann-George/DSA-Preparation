import java.util.Scanner;

class Fibonacci{
 
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of terms:");
    int no = sc.nextInt();
    int prev = 0;
    int curr = 1;
    int temp = 0;
    System.out.println(prev+"\n"+curr);
    for(int i=2;i<no;i++){
      temp = curr;
      curr =curr + prev;
      prev = temp;
      System.out.println(curr);
    }
  }

}
