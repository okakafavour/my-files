import java.util.Scanner;
 public class Area{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter x1: ");
double x1 = sc.nextDouble();

System.out.print("Enter x2: ");
double x2 = sc.nextDouble();

System.out.print("Enter x3: ");
double x3 = sc.nextDouble();

System.out.print("Enter y1: ");
double y1 = sc.nextDouble();

System.out.print("Enter Y2: ");
double y2 = sc.nextDouble(); 

System.out.print("Enter y3: ");
double y3 = sc.nextDouble();

double point1 = (x1 * y1);
System.out.println("the point1 is: " + point1);

double point2 = (x2 * y2);
System.out.println("the point2 is: " + point2);

double point3 = (x3 * y3);
System.out.println("the point3 is: " + point3);

double sides = (point1 + point2 + point3)/2;
System.out.println("the sides is: " + sides);

double area_of_the_triangle = Math.sqrt(sides * (sides - point1) * (sides - point2) * (sides - point3));
System.out.println("the area_of_the_triangle: " + area_of_the_triangle);








}



}