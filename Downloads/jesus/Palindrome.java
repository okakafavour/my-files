import java.util.Scanner;

public class Palindrome{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter a three digit number: ");
int integer = input.nextInt();

int first_number = integer % 10;
integer /= 10;

int second_number = integer % 10;
integer /= 10;

int third_number = integer % 10;
integer /= 10;

if (first_number == third_number) {
System.out.println("it is a parlindrome number: ");
} else  { 
System.out.println("it is not a parlindrome number: ");
}




}


}