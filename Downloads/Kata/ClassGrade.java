import java.util.Scanner;

public class ClassGrade{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

int total = 0;
int gradeCounter = 0;

System.out.print("Enter grade or -1 to quit: ");
int grade = input.nextInt();

while (grade != -1) {
total = total + grade;
gradeCounter = gradeCounter + 1; 

System.out.print("Enter grade  or -1 to quit: ");
int grade = input.nextInt();
 }

if (gradeCounter != 0) {
 double average = (double) total / gradeCounter;

System.out.print("%nTotal of the %d grades entered is %d%n", gradeCounter, total);

System.out.print("Class average is %.2f%n", average);

  }
    else {
       System.out.println("No grade were entered"); 



		}

	 }

    } 

 