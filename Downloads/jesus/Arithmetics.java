import java.util.Scanner;
public class Arithmetics{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first_number: ");
int first_number = input.nextInt();

System.out.print("Enter second_number: ");
int second_number = input.nextInt();

System.out.print("Enter third_number: ");
int third_number = input.nextInt();

int sum = first_number + second_number + third_number;
System.out.println("The sum: " + sum);

int average = first_number + second_number + third_number;
System.out.println("The average: " + average);

int product = first_number + second_number + third_number;
System.out.println("The product: " + product);

if (first_number > second_number && first_number > third_number){
System.out.println("largest number: " + first_number);
}


    else if (second_number > first_number && second_number > third_number){
 System.out.println("largest number: " + second_number);

}
else if (third_number > first_number && third_number > second_number){
 System.out.println("largest number: " + third_number);

}


if (first_number < second_number && first_number < third_number){
 System.out.println("Smallest number: " + first_number);

}
 else if (second_number < first_number && second_number < third_number){
  System.out.println("Smallest number: " + second_number);

}
else if (third_number < first_number && third_number < second_number){
System.out.println("Smallest number: " + third_number);

}


}



}