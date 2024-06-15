package CodSoft;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class QuizApplicationWithTimer {

    public static String[] questions = {
            "How many weeks are there in one Month ?",
            "What is Formula of Perimeter of Circle ?",
            "Who is Current Prime Minister of India ?",
            "In Which State is Taj Mahal ?",
            "Which is the Most Populated Country ?"
    };

    public static final  String[][] options = {
            {"5" , "4" , "3" , "2"},
            {"PI*R*R*H" , "PI*R*R" , "2*PI*R*H" , "2*PI*R"},
            {"Narendra Modi" , "Rahul Gandhi" , "Amit Shah" , "C.R. Patil"},
            {"Gujarat" , "Maharashtra" , "Uttar Pradesh" , "Madhya Pradesh"},
            {"India" , "China" , "America" , "Russia"}
    };

    public static String[] answers = {
            "4",
            "2*PI*R",
            "Narendra Modi",
            "Uttar Pradesh",
            "India"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pre-Notes : ");
        System.out.println("This Quiz will be of 5 Questions.");
        System.out.println("Per Questions you have 10 Seconds");
        System.out.println("At the End of Program Score will be Shown.. \n\n\n\n");


     int i = 0, score = 0 ;

     while(i <= 4) {

         int index = i ;
         String question = questions[index];
         String[] option = options[index];
         String answer = answers[index];

         System.out.println(question);

         for(int j = 0 ; j < options.length-1 ; j++){
             System.out.println((j+1)+ "." +" "+ option[j]);
         }

         System.out.println();
         System.out.print("Enter Your Choosen Option : ");
         long startTime = System.currentTimeMillis();


         int chosen = sc.nextInt();
         long endTime = System.currentTimeMillis();

         String checkans = option[chosen-1];

         if(checkans.equals(answer)){
             if(endTime - startTime <= 10000){
             System.out.println("Congratulations.... Correct Answer\nYou Scored 1 Point...\n\n");
             score++;
             }
             else {
                 System.out.println("Sorry !! Time UP... Correct Answer : " + answer +"\n\n");
             }
         }
         else{
             System.out.println("Wrong Answer!... Correct Answer : " + answer+ "\n\n");
         }

         i++;
     }

        System.out.println("\n\nYour Score = " + score + " Out of 5\n");
     sc.close();
    }
}
