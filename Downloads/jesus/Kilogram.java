import java.util.Scanner;
public class Kilogram{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Number in pounds: ");
double poundsNum = input.nextDouble();

double numInKilogram = poundsNum * 0.454;
System.out.print("Number in kilogram: "+numInKilogram); 

     }

}