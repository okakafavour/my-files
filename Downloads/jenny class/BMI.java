 import java.util.Scanner;
 public class BMI{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
System.out.print("Enter weight: ");
double weight = sc.nextDouble();
double pounds = weight * 0.45359237;
System.out.print("Enter height: ");
 double height = sc.nextDouble();
double inches = height * 0.0254;

double BMI = pounds/(inches * inches);
  System.out.print("The BMI is " + BMI);
 

}



}