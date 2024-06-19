package Ankit;
import java.util.Random ;
import java.util.Scanner ;

class library{
  Random ran = new Random();
  int n = ran.nextInt(100);
  
  int[] books = new int[n];
  
  library(){
    System.out.println("This Is library ::: \n");
  }
  
  public void availableBooks(){
    System.out.println("\n\nAvailable Books are :: " + books.length );
  }
  
  public void addBook(int a){
    books = new int[n+a];
    System.out.println("Books Added Successfully..");
  }
  
  public void issueBook(int a){
    System.out.println("\n\nPlease Wait A Moment....");
    books = new int[n-a];
    System.out.println("\nChoosing Books...");
    System.out.println("\nBooks Issued Successfully....");
    
  }
  
  public void returnBook(int a){
    System.out.println("\n\nPlease Wait A Moment....");
    books = new int[n+a];
    System.out.println("\nReading Data....");
    System.out.println("\nBooks Returned Successfully....");
    
  }
}

public class LibraryProject {
public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  
  System.out.println("Hello Calling the Library.... \n");
  
  library li = new library();
  System.out.println("Generating Data...");
  System.out.println("Please Wait \n");
  
  li.availableBooks();
  
  System.out.println("\n\n\nWhat you want to do ???  :: \n");
  
  System.out.println("(1 for add Book)");
  System.out.println("(2 for issue Book)");
  System.out.println("(3 for return Book)");
  
  int n = sc.nextInt();
  
  if(n == 1){
    System.out.println("How many Books You want to Add ??");
    int m = sc.nextInt();
    
    li.addBook(m); 
  }
  
  else if(n == 2){
    System.out.println("How many Books You want to Issue ?? ");
    int issue = sc.nextInt();
    
    if(issue <= li.n){
    
     li.issueBook(n);
     
    }
    
    else{ 
    
      System.out.println("Enter Valid Book Numbers...");
      
    }
  }
  
  else if(n == 3){
    
    System.out.println("How many Books You want to Return ??");
    
    int ret = sc.nextInt();
    
    li.returnBook(ret);
  }
  
  li.availableBooks();
  
 }
}
