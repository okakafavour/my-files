import java.util.Scanner;
public class Circle{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Number in π: ");
double π = sc.nextDouble();
System.out.println("Enter number for radius: ");
double radius = sc.nextDouble();

double area = radius * radius * π;
System.out.println("Area is: " +area);
double perimeter = 2 * radius * π;
System.out.println("Perimeter is: " +perimeter);


  

}

}