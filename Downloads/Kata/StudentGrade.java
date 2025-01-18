import java.util.ArrayList;
import java.util.Scanner;
 public class StudentGrade {
  public static void main(String[] args){
  
   Scanner sc = new Scanner(System.in);
   
   int numberOfStudent = 0;
   int numberOfSubject = 0;

   System.out.println("How many students do you have?: ");
    numberOfStudent = sc.nextInt();
   
   System.out.println();
   
   System.out.println("How many subject do they offer?: "); 
    numberOfSubject = sc.nextInt();
   
   System.out.println();

   
   for(int count = 0; count < numberOfStudent; count++){

   int Score;

   System.out.println("Enter score for student", (numberOfStudent + 1) + ":" );
   for(int counter = 0; counter < numberOfSubject; counter++);
   System.out.printf("%s  %s%n", "Enter score for subject", numberOfSubject);
   
   System.out.println("""
   
   
   Saving >>>>>>>>>>>>>>>>>>>>>>>
   saves successfully 
   """);
   }
  }
 }