
 public class AccountTest{

public static void main(String[] args){


Account account1 = new Account("Okaka favour");
Account account2 = new Account("Oguntade taye");

System.out.printf("%s balannce: $%.2f%n", account1.getName(), account1.getBalance());
System.out.printf("%s balannce: $%.2f%n", account2.getName(), account2.getBalance());


Scanner input = new Scanner(System.in);

System.out.print("Enter deposite ammount for account1: ");
 double depositAmount = input.nextDouble();

System.out.print("%nadding %.2f to account balance%n%n", depositeAmount);
account1.deposit(depositAmount);

System.out.print("%s balance: $%.2f%n",account1.getName(),account1.getBalance());

System.out.print("%s balance: $%.2f%n",account2.getName(),account2.getBalance());

System.out.print("Enter deposit amount for account2: ");
depositAmount = input.nextDouble();

System.out.printf("%nadding %.2f to account2 balance%n%n",depositAmount);
account2.deposit(depositAmount);

System.out.printf(%s balance: $%.2f%n",account1.getName(), account1.getBalance());
System.out.printf("%s balance: $%.2f%n%n",
account2.getName(), account2.getBalance():


    }

 }