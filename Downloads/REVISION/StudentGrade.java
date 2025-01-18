import java.util.Arrays;
import java.util.Scanner;
   public class StudentGrade{
	public static void main(String...args){
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Teacher enter the number of students: ");
	 int numberOfStudents = sc.nextInt();
	 
	 while(numberOfStudents < 1) {
	 System.out.println("invalid input.Please enter a valid: ");
	 }
	   
	   System.out.println(": How mant subject do they offer: ");
	   int numberOfSubject = sc.nextInt();
	   
	 int[][] studentScores = new int[numberOfStudents][numberOfSubject];
	 String[] studentNames = new String[numberOfStudents];

	System.out.println("Eneter the score for subject: ");
	int scoreForSuject = sc.nextInt();
	
	for(subject = 0; subject < numberOfStudent; subject++;){
	int score;
	do {
	System.out.println("score for subject" + (subject + 1) + ":  ");
		score = sc.nextInt();
		
		if (score < 0 || score > 100);
		System.out.println("Enter score from 0 - 100");
	} while (score < 0 || score > 100);
	studentScore[numberOfStudent][numberOfSubject] = score;
		}
	}