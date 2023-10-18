
import java.util.Scanner;


public class Main {
    
      public static void main(String[]args){
          Account b1 = new Account();
          Scanner input = new Scanner(System.in);

   
          System.out.println("Input the balance:");
    
          double para = input.nextDouble();

    
          b1.setBalance(para);
   
          b1.display();

    
          System.out.println("Enter the withdrawal amount:");
    
          double withdrawAmount = input.nextDouble();
   
          b1.withdraw(withdrawAmount);
    
          b1.display();
      }
}
