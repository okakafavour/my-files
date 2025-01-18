import java.util.Scanner;

public class CreditLimitCalculator{

public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.println("Enter account number: ");
int accountNumber = input.nextInt();

System.out.println("Enter balance at the beginning of the month: ");
int beginnigBalance = input.nextInt();

System.out.println("Enter total of all items charged at the beginning of the month: "); 
int charges= input.nextInt();

System.out.println("Enter total of all credits applied to the customers account this month: ");
int credits = input.nextInt();

System.out.println("Enter allowed credit limit: ");
int allowedCreditLimit = input.nextInt();

int newBalance = beginningBalance + charges - credits;
System.out.println("The new balance is: "+newbalance);

if ("










   }

 }