import java.util.Scanner;
   public class Arithmetic{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
   System.out.print("Enter the first_number: ");
double first_number = sc.nextDouble();

 System.out.print("Enter the secound_number: ");
double second_number = sc.nextDouble();

double square_of_first_number = first_number * first_number;
System.out.println("the square of first number is: " +  square_of_first_number);

double square_of_second_number = second_number * second_number;
System.out.println("the square of second number is: " + square_of_second_number);

double sum_of_squares = square_of_first_number + square_of_second_number;
System.out.println("the sum of squares is: " + sum_of_squares);

double difference_of_their_square = square_of_first_number - square_of_second_number;
System.out.println("the difference of their square is: " + difference_of_their_square);



 

}



}