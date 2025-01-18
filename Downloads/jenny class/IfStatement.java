import java.util.Scanner;

public class IfStatement{

public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.println("Enter two numbers");


System.out.print("Enter first number: ");
int firstNumber = input.nextInt();

System.out.print("Enter second number: ");
int secondNumber = input.nextInt();

int sum = firstNumber + secondNumber;

if (sum > 100)System.out.print("greather than 100");

if (sum < 100)System.out.print("less than");

if (sum == 100)System.out.print("100");






}





}