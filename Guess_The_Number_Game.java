package CipherByte;
import java.util.*;


public class Guess_The_Number_Game {
    static Scanner sc = new Scanner(System.in);


    public static int check(int num, int ans){
        int count = 0 ;

        while(num != ans){

            if(num < ans){
                System.out.println("Enter Big Number...");
                count++;
                num = sc.nextInt();
            }
            else if (num > ans) {
                System.out.println("Enter Small Number...");
                count++;
                num = sc.nextInt();
            }
            else if (num == ans) {
                System.out.println("Congratulations !! You Guessed the Right Number...");
                System.out.println("You took " + count + "Task...");
                break ;
            }
            else{
                System.out.println("Enter Valid Number...");
                count++;
                num = sc.nextInt();
            }
        }

        System.out.println("Congratulations !! You Guessed The Right Numer...");
        System.out.println("You Took : " + count + " Chance");

        return count;
    }

    public static void main(String[] args) {

        Random ran = new Random();

        System.out.println("Pre Notes : ");
        System.out.println("In This Game PC has Generated Random Number between 1 to 100,");
        System.out.println("it is two Player Games... There Will be Two Rounds,");
        System.out.println("First will be of Player and Second Round will be of Player2...");
        System.out.println("If You Guess The Correct Number then You are win...");

        System.out.print("\n\n\nEnter Player1 Name : ");
        String p1 = sc.next();

        System.out.print("Enter Player2 Name : ");
        String p2 = sc.next();

        System.out.println("\n\n" + p1 + "'s Turn..");

        int num1 = ran.nextInt(1, 101);
        System.out.print("\nPC has Choosen The Number... Prompt the Number : ");

        int try1 = sc.nextInt();

        int attempt1 = check(try1, num1);

        System.out.println("\n\n" + p2 + "'s Turn..");

        int num2 = ran.nextInt(1, 101);
        System.out.print("\nPC has Choosen The Number... Prompt the Number : ");

        int try2 = sc.nextInt();

        int attempt2 = check(try2, num2);
        System.out.println("Congratulations !! You Guessed the Right Number...");

        System.out.println("\n\n");
        if(attempt1 < attempt2){
            System.out.println(p1 + " Wins !!");
        }
        else if(attempt1 > attempt2){
            System.out.println(p2 + " Wins !!");
        }
        else
            System.out.println("Match is Draw...");

    }
}
