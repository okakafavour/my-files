import java.util.Scanner;
 public class AreaOfRectangle{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
System.out.println("Enter the width of a rectangle");
double width = sc.nextDouble();
System.out.println("Enter the height of the rectangle");
double height = sc.nextDouble();

double area = width * height;
System.out.println("Area is: " +area);
double perimeter = 2 *(width+height);
System.out.println("perimeter is: " +perimeter);




}



}
 