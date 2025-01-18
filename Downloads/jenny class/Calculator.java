import java.util.Scanner;

 public class Calculator{
 
 public static void main(String[] args){


 Scanner sc = new Scanner(System.in);

System.out.print("Enter Account number: ");
double accountNumber = sc.nextDouble();

System.out.print("Enter balance at the beginning of the month: ");
double beginning_balance = sc.nextDouble();

System.out.print("Enter total of all items charged by the customer this month: ");
double charges = sc.nextDouble();

System.out.print("Enter total of all credit applied to the customer's account this month: ");
double customers_account_this_month = sc.nextDouble();

System.out.print("Enter allowed credit limit: ");
double credit_limit = sc.nextDouble();

double new_balance = beginning_balance + charges - credit_limit;
System.out.print("new balance is: " +new_balance);


   int userinput = 0;
   int customers_credit_limit = 1;
 
if ( 0 > 1 ); System.out.println("credit limit exceeded");









}





}