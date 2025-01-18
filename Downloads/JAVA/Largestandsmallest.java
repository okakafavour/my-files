import java.util.Scanner;
  public class Largestandsmallest{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter the first_integer: ");
int first_integer = input.nextInt();

System.out.print("Enter the second_integer: ");
int second_integer = input.nextInt();

System.out.print("Enter the third_integer: ");
int third_integer = input.nextInt();

System.out.print("Enter the fourth_integer: ");
int fourth_integer = input.nextInt();

System.out.print("Enter the fifth_integer: ");
int fifth_integer = input.nextInt();

if (first_integer > second_integer && first_integer > third_integer && first_integer > fourth_integer && first_integer > fifth_integer){
   System.out.println("largest integer: " + first_integer);
}
else if (second_integer > first_integer && second_integer > third_integer && second_integer > fourth_integer && second_integer > fifth_integer){
System.out.println("largest integer: " + second_integer);
}
 else if (third_integer > first_integer && third_integer > second_integer && third_integer > fourth_integer && third_integer > fifth_integer){
System.out.println("largest integer: " + third_integer);
}
else if (fourth_integer > first_integer && fourth_integer > second_integer && fourth_integer > third_integer && fourth_integer > fifth_integer){
System.out.println("largest integer: " + fourth_integer);
}
else if (fifth_integer > first_integer && fifth_integer > second_integer && fifth_integer > third_integer && fifth_integer > fourth_integer){
System.out.println("largest integer: " + fifth_integer);
} 

if (first_integer < second_integer && first_integer < third_integer && first_integer < fourth_integer && first_integer < fifth_integer){
   System.out.println("Smallest integer: " + first_integer);
}
else if (second_integer < first_integer && second_integer < third_integer && second_integer < fourth_integer && second_integer < fifth_integer){
System.out.println("Smallest integer: " + second_integer);
}
 else if (third_integer < first_integer && third_integer < second_integer && third_integer < fourth_integer && third_integer < fifth_integer){
System.out.println("Smallest integer: " + third_integer);
}
else if (fourth_integer < first_integer && fourth_integer < second_integer && fourth_integer < third_integer && fourth_integer < fifth_integer){
System.out.println("Smallest integer: " + fourth_integer);
}
else if (fifth_integer < first_integer && fifth_integer < second_integer && fifth_integer < third_integer && fifth_integer < fourth_integer){
System.out.println("Smallest integer: " + fifth_integer);
} 










}












}