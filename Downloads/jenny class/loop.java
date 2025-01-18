import java.util.Scanner;

public class loop{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
 int userInput;
 int userreply;

do {  


    System.out.print("enter first_number: ");
    double first = sc.nextDouble();

    System.out.print("enter second_number: ");
    double second = sc.nextDouble();

    double sum = first + second;
    System.out.print("the sum is: " + sum);

 
   System.out.println("Do you wish to perform this action again? yes(1)/no(0)");

    userInput = sc.nextInt();
}
  while (userInput == 1);
 
   
   
    
 

}
}