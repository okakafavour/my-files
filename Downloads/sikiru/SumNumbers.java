import java.util.Scanner;
public class SumNumbers{


public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter firstNumber: ");
int firstNumber = input.nextInt();

System.out.print("Enter secondNumber: ");
int secondNumber = input.nextInt();

int sum = firstNumber + secondNumber;
System.out.println("the sum is: "+sum);


int average = sum/2;
System.out.println("the average is: "+average);

int square = sum * sum;
System.out.println("the square is: "+square);
 


   }


}