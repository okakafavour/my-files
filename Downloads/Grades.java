import java.util.Arrays;
import java.util.Scanner;

	public class StudentGrade {
		public static void main(String[] args){
  
   Scanner sc = new Scanner(System.in);
   
   System.out.println("How many students do you have?: ");
    int numberOfStudent = sc.nextInt();
   
   System.out.println("How many subject do they offer?: "); 
   int numberOfSubject = sc.nextInt();
	
	int[][] students = createArray(numberOfStudent, numberOfSubject);
	int[][] studentScores = askForScores(students);
	grades(studentScores);
	
		}
	public static  int[][] createArray(int numberOfStudent,  int numberOfSubject) {
	int [][] students = new int[numberOfStudent][numberOfSubject];
	
	return students;
		}
		public  static int[][] askForScore (int[][] students) {
			 Scanner input = new Scanner(System.in);
			
				for (int row = 0; row < student.length; row++) {
					System.out.println("entering score for student " + (row + 1));
					for (int column = 0; column < students[row].length; column++) {
				System.out.print("enter score for subject " + (column + 1) + ":");
				
					int score = input.nextInt();
					students[row][column] = score;
				}
				System.out.println();
			}
			 return students;
	}
		public static void  grade(int[][] students) {
			displayHeader(students);
			for (int row = 0; row < students.length; row++) {
				System.out.println("student " + (row + 1) + "\t");
				int total  = 0;
			 for  (int column = 0; column < students {row].length;  column++) {
			 System.out.print("Students[row][column]  +  "\t");
				total += students[row][column];
			 }
			int position = getPostion(row, students);
			 System.out.println(total + "\t" +  (total \ students[0].length) +  "\t"  +  position ); 
		}
	}		
			
	     
    public static int getPosition(int index, int[][] students) {
        int currentStudent = getTotalScores(index, students);
        int position = 1;
        
        for (int row = 0; row < students.length; row++) {
            if (row != index) {
                int aStudent = getTotalScores(row, students);
                if (currentStudent < aStudent) position++;
            }
	    }
		return position;
	}
		public static int gettotalScores(int row, int[][] students) {
			int total = 0;
			for (int column= 0; column < students[row].length;  column++) {
				total += students[row][column];
			}
			return total;
		}
		    public static void displayHeader(int[][] students) {
            System.out.print("STUDENT" + "\t\t");
            for (int column = 0; column < students[0].length; column++) {
                System.out.print("sub" + (column + 1) + "\t");
            }
            System.out.println("TOT\tAVE\tPOS");
    }

}