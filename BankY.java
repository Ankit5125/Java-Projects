package CipherByte;

import java.util.Scanner;

public class BankY {
    static Scanner sc = new Scanner(System.in);

    static String[][] account = new String[1][5];
    static int money ;

    public static void createAccount(){

        System.out.print("Enter Your Name : ");
        String name = sc.next();
        System.out.print("Enter Surname : ");
        String Surname = sc.next();
        System.out.print("Enter Father Name : ");
        String fathername = sc.next();
        String fullname = name + " " + Surname + " " + fathername ;
        account[0][0] = fullname ;


        System.out.print("Enter Aadhar Number : ");
        String aadhar = sc.next();
        while(aadhar.length() != 12){
            System.out.println("Enter Valid Aadhar Number : ");
            aadhar = sc.next();
        }
            account[0][1] = aadhar;


        System.out.print("Enter Pan Card Number : ");
        String pan = sc.next();
        while(pan.length() != 10){
            System.out.println("Enter Valid PAN Number : ");
            pan = sc.next();
        }
            account[0][2] = pan;



        System.out.print("Enter Mobile Number : ");
        String mobile = sc.next();
        while(mobile.length() != 10 ){
            System.out.println("Enter Valid Mobile Number : ");
            mobile = sc.next();
        }
            account[0][3] = mobile;


        System.out.print("Enter Intial Money : ");
        money = sc.nextInt();

    }

    public static void main(String[] args){

        System.out.println("Welcome to Bank...\n\n");

        int action ;
        System.out.println("\n1. Create Bank Account.");
        System.out.println("2. Account Details.");
        System.out.println("3. Deposit Money.");
        System.out.println("4. Withdraw Money.");
        System.out.println("5. Transfer Money.");
        System.out.println("6. Check Balance.");
        System.out.println("7. Exit.");

        System.out.print("\nWhat you want to do ? : ");
        action = sc.nextInt();

        while(action != 7) {
            switch (action) {
                case 1:
                    System.out.println("\nSure !");
                    createAccount();
                    break ;


                case 2 :
                    if(account == null){
                        System.out.println("\nPlease Create Bank Account First. !\n");
                    }
                    else {
                        System.out.println("\nName : " + account[0][0]);
                        System.out.println("Aadhar Number : " + account[0][1]);
                        System.out.println("PAN Card : " + account[0][2]);
                        System.out.println("Mobile Number : " + account[0][3]);
                        System.out.println("Current Balance : " + money);

                    }
                    break ;

                case 3:
                    if(account == null){
                        System.out.println("\nPlease Create Bank Account First. !\n");
                    }
                    else {
                        System.out.println("\nYou have " + money + " in Your Account.");
                        System.out.print("Enter Amount You want to Deposit : ");
                        int add = sc.nextInt();
                        money += add ;
                        System.out.println("Successfully Deposited...");
                        System.out.println("You have " + money + " in Your Account.");
                    }
                    break;

                case 4 :
                    if(account == null){
                        System.out.println("\nPlease Create Bank Account First. !\n");
                    }
                    else {
                        System.out.println("\nYou have " + money + " in Your Account.");
                        System.out.print("Enter Amount You want to Remove : ");
                        int remove = sc.nextInt();
                        while(remove > money && remove > 0){
                            System.out.println("Enter Less then " + money + " : ");
                            remove = sc.nextInt();
                        }
                        money -= remove ;
                        System.out.println("Successfully Withdraw...");
                        System.out.println("You have " + money + " in Your Account.");
                    }
                    break;

                case 5:
                    if(account == null){
                        System.out.println("\nPlease Create Bank Account First. !\n");
                    }
                    else {
                        System.out.print("\nEnter Receivers Bank Account Number : ");
                        String raccount = sc.next();
                            while(raccount.length() != 12){
                                System.out.println("Enter Valid Account Number : ");
                                raccount = sc.next();
                            }
                            System.out.print("Enter Amount You want to send : ");
                            int send = sc.nextInt();
                            while(send > money){
                                System.out.println("Enter Amount Less Then " + money +" : ");
                                send = sc.nextInt();
                            }
                            money -= send ;
                            System.out.println("You have " + money + " in Your Account.");
                        }
                    break;

                case 6 :
                    if(account == null){
                        System.out.println("\nPlease Create Bank Account First. !\n");
                    }
                    else {
                        System.out.print("\nCurrent Balance : " + money);
                    }
                    break ;

                case 7:
                    break;

                default:
                    System.out.println("\nEnter valid Input..");
                    break;
            }
            System.out.println("\n\n1. Create Bank Account.");
            System.out.println("2. Account Details.");
            System.out.println("3. Deposit Money.");
            System.out.println("4. Withdraw Money.");
            System.out.println("5. Transfer Money.");
            System.out.println("6. Check Balance.");
            System.out.println("7. Exit.");

            System.out.print("\nWhat you want to do ? : ");
            action = sc.nextInt();
            System.out.println();
        }
        System.out.println("\n\nThank You.. Visit Again.\n\n\n");

        sc.close();
    }
}