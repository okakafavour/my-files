import java.util.Array;
import java.util.Scanner;
 public class StudentGrade {
  public static void main(String[] args){

   Scanner sc = new Scanner(System.in);

   int numberOfStudent = 0;
   int numberOfSubject = 0;

   System.out.println("How many students do you have?: ");
    numberOfStudent = sc.nextInt();

   System.out.println("How many subject do they offer?: ");
    numberOfSubject = sc.nextInt();

   int[][] studentscores = new int[numberOfStudent][numberOfSubject];



   for(int subject = 0; subject < numberOfStudent; subject++){

   int Score;
   do {
	   System.out.println("Eneter score for subject" + (subject + 1 ) + ": " );
	   score = Scanner.nextInt();

	    if (score < 0 || score > 100) {
			System.out.println("Error: input score between 0  - 10");
		}
   } while (score < 0 || scoe > 100);
	studentscores[numberOfStudent][numberOfSubject];
	System.out.println("""
   Saving >>>>>>>>>>>>>>>>>>>>>>>
   saves successfully
   """);
				}










			}
	}