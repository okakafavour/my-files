import java.util.Scanner;
public class Acceleration{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Number of starting velocity: ");
double v1 = sc.nextDouble();
System.out.print("Number of ending velocity: ");
double v2 = sc.nextDouble();
System.out.print("Number of timetaken: ");
double t = sc.nextDouble();

double Acceleration = (v1-v2)/t;
System.out.print("the acceleration is: " + Acceleration);




}

}  