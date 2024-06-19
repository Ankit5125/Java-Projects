package Ankit;
import java.util.Random;
import java.util.Scanner;

public class RPSGAME {

public static void main(String[] args)
{
  
  Scanner sc = new Scanner(System.in);
  Random ran = new Random();
  
  System.out.println("Enter the Number (1 for ROCK, 2 for PAPER, 3 for SECCOR) ::: ");
  int num1 = sc.nextInt();
  
    
    
    System.out.print("\n\n");
    
     
    switch (num1) {
    
    case 1 :
    System.out.println("You have choosed ROCK...");
    break;
    
    case 2 :
    System.out.println("You have Choosed PAPER...");
    break ;
    
    case 3 :
    System.out.println("You have Choosed SECCOR...");
    break ;
    
    default : 
    System.out.println("Please enter Valid number...");
    break ;
    
    }
    
    
    System.out.print("\n\n");
    
    
    
    int num2 = ran.nextInt(3);
    
    if(num2 == 0)
    System.out.println("PC have choosed ROCK...");
    
    else if(num2 == 1)
    System.out.println("PC have Choosed PAPER...");
    
    else
    System.out.println("PC have Choosed SECCOR...");
    
    
    
    
    System.out.print("\n\n");
    
    
    
    if(num1-1 == num2)
    {
      System.out.print("\n\nGame is Draw");
    }
    
    
    
    if(num1 == 1 && num2 == 1)
    {
      System.out.print("\n\nCOMPUTER WINS...");
    }
    
    else if(num1 == 1 && num2 == 2)
    {
      System.out.print("\n\nYOU WINS...");
    }
    
    
    
    if(num1 == 2 && num2 == 0)
    {
      System.out.print("\n\nYOU WINS...");
    }
    
    else if(num1 == 2 && num2 == 2)
    {
      System.out.print("\n\nCOMPUTER WINS...");
    }
    
    
    
    if(num1 == 3 && num2 == 0)
    {
      System.out.print("\n\nCOMPUTER WINS...");
    }
    
    else if(num1 == 3 && num2 == 1)
    {
      System.out.print("\n\nYOU WINS...");
    }
    
    
    
    
}
}
