package utils;

import java.util.Scanner;
import java.util.InputMismatchException;

public class IntegerValidator {
   public static int validateInteger(Scanner sc){
        while(true){
            try{
                return sc.nextInt();
            }
            catch(InputMismatchException e){
                System.err.println("Enter a valid integer");
            }
        }
   } 
}
