package CodSoft;
import java.util.Scanner;

interface atm {
    void withdraw(int w);
    void deposit(int d);
    void checkBalance();
} 

class bankAccount implements atm {
    int balance ;
    public void setBalance(int b){
        this.balance = b ;
    }
    public void withdraw(int w){
        if(w > 20000){
            System.out.println("Amount Exceeded ! please Enter Valid Amount... \n");
        }
        else{
            balance -= w ;
            System.out.println("successfully withdrawn... Thank You ! \n");
        }
    }

    public void deposit(int d){
        if(d > 10000){
            System.out.println("Amount Exceeded ! please Enter Valid Amount... \n");
        }
        else{
            balance += d ;
            System.out.println("successfully Deposited... Thank You ! \n");
        }
    }

    public void checkBalance(){
        System.out.println("Available Balance : " + balance);
    }
}

public class ATM_Machine {

    static Scanner sc = new Scanner(System.in);
    static bankAccount b = new bankAccount();

    public static void transaction(int t){

        switch (t) {
            case 1 :    
                System.out.println("Enter Amount of Withdrawing : ");
                System.out.println("(NOTE : Maximum amount = 20000)");
                int with = sc.nextInt();
                b.withdraw(with);
                b.checkBalance();
                break ;

            case 2 :
                System.out.println("Enter Amount you want to Add : ");
                System.out.println("(NOTE : Maximum Depositing Amount = 10000)");
                int d = sc.nextInt();
                b.deposit(d);
                b.checkBalance();
                break ;

            case 3 : 
                b.checkBalance();
                break ;

            case 0 : 
                System.out.println("Thank You !\n");
                b.checkBalance();
                break ;

            default : 
                System.out.println("Enter Valid number !!\n");
        }
    }
    public static void main(String[] args) {
        
        System.out.print("Enter Initial Balance : ");
        int bal = sc.nextInt();
        b.setBalance(bal);

        System.out.println("Press 1 for Withdrawing : ");
        System.out.println("Enter 2 for Depositing : ");
        System.out.println("Enter 3 for Checking Balance : ");
        System.out.println("Enter 0 for Cancel Transaction : ");
        int t = sc.nextInt();

        transaction(t);
        

        sc.close();
    }
}
