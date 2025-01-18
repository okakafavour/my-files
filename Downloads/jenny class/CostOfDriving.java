import java.util.Scanner;

public class CostOfDriving{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the distance: ");
double distance = sc.nextDouble();

System.out.print("Enter miles per gallon: ");
double miles = sc.nextDouble();

System.out.print("Enter price per gallon: ");
double gallon = sc.nextDouble();

double costOfDriving = (distance * gallon)/miles;
System.out.print("the cost of driving is: "+ costOfDriving);



	    }


   }