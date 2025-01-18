import java.util.Scanner;
 
public class SumOfTwoNumbers{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the firstNumber");
int firstNumber = input.nextInt();

System.out.print("Enter the secondNumber");
int secondNumber = input.nextInt();

int sum = firstNumber + secondNumber;
System.out.print("the sum is: "+ sum);




}



}