package CodSoft;
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void grade(float ava){
        if(ava >= 91 && ava <= 100){
            System.out.println("Grade : A1");
        }
        else if(ava >= 81 && ava <= 90){
            System.out.println("Grade : A");
        }
        else if(ava >= 71 && ava <= 80){
            System.out.println("Grade : B1");
        }
        else  if(ava >= 61 && ava <= 70){
            System.out.println("Grade : B");
        }
        else if(ava >= 51 && ava <= 60){
            System.out.println("Grade : C1");
        }
        else if(ava >= 41 && ava <= 50){
            System.out.println("Grade : C");
        }
        else if(ava >= 33 && ava <= 40){
            System.out.println("Grade : D");
        }
        else{
            System.out.println("Grade : F");
        }
    }

    public static Boolean checkSubjectFail(int[] subject){
        
        for(int ele : subject){
            if(ele <= 33){
                return false ;
            }
        }
        return true ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter How many subject Do you have : ");
        int n = sc.nextInt();

        int[] subject = new int[n];

        System.out.println("Enter per Subject Marks : ");
        
        int i = 0, sum = 0 ;
        float ava = 0 ;
        while(i < n){
            subject[i] = sc.nextInt();
            
            if(subject[i] > 100 || subject[i] < 0){
                System.out.println("Enter Valid Marks...");
                break ;
            }

            sum += subject[i] ;
            ava += subject[i]/n ;
            i++;
        }
        sc.close();

        System.out.println("\nis Student Passed in all Subjct : " +  checkSubjectFail(subject) );
        if(checkSubjectFail(subject) == true){
            System.out.println("Sum of total Subect = " + sum);
            System.out.println("Avarage of total Subect = " + ava);
            grade(ava);
        }
        else{
            System.out.println("\n\nSorry you are Failed....");
        }
    }
}
