import java.util.Array;
import java.util.Scanner;
 public class StudentGrade {
  public static void main(String[] args){
  
   Scanner sc = new Scanner(System.in);
   
   int row = 0;
   int col = 0;
   int total = 0;
   
   double [][] = int studentGrade[numberOfStudent][numberOfSubject];   

   System.out.println("Welcome To Lagbaja International School"); 
   
   System.out.println("How many students do you have?: ");
    numberOfStudent = sc.nextInt();
   
   System.out.println();
   
   System.out.println("How many subject do they offer?: "); 
    numberOfSubject = sc.nextInt();
   
   System.out.println();
   
     System.out.println("""
   Saving >>>>>>>>>>>>>>>>>>>>>>>
   saves successfully 
   """);
  
   System.out.println();
    
  for(int row = 0; row < studentGrade.lenght; row++) {
  System.out.println("Number Of student" + " " "row++");
   for (int col = 0; col < studentGrade.length; col++) {
	   System.out.println("Number of subject" + "col++");
	    total+= studentGraade[row][col];
     }
  }

    System.out.println("""
   Saving >>>>>>>>>>>>>>>>>>>>>>>
   saves successfully 
   """);
  
  }
 }