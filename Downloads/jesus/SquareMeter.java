 import java.util.Scanner;
 public class SquareMeter{
   public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.printf("Enter number as squaremeter: ");
 double squaremeterNum = input.nextDouble();

double numInPing = squaremeterNum * 0.325;
System.out.print("Number in ping: "+numInPing);


}


}