import java.util.Scanner;

public class palindromes{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter five digit integers: ");
int userinput = input.nextInt();

int number1 = userinput % 10;
int number2 = userinput / 10;
int number3 = number2 % 10;
int number4 = number2 /10;
int number5 = number4 % 10;
int number6 = number4 / 10;
int number7 = number6 % 10;
int number8 = number6 / 10;

if(number1 == number8)System.out.print(userinput + " is a palindrome number");

else System.out.print(userinput + " is  not a palindrome number");


}







}