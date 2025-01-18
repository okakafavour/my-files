import java.util.Scanner;

public class CheckOut{
	public static void main(String...args){

	Scanner sc = new Scanner(System.in);

	System.out.println("What is the customer's Name? ");
	String name = sc.nextLine();

	double totalDiscount = 0;
	double totalCost = 0;
	boolean reply;
	String receipt = "";
	
	try {
		do {
	System.out.println("What did the user buy?");
	String items = sc.nextLine();
} catch(Exception e) {
			System.out.println("Invlalid input, please enter valid input");
		}
		
	System.out.println("How many pieces?");
	int pieces = sc.nextInt();
	if (pieces <= 0) {
            System.out.println("Invalid input,Please enter valed input");
	  }
		

	System.out.println("How much per unit?");
	double price = sc.nextInt();

	double itemCost = pieces * price;

	System.out.println("How much discount are you applying(in percentage): ");
	double discountPercentage = sc.nextDouble();

	double discountValue = (discountPercentage / 100) * itemCost;
	totalCost += itemCost - discountValue;
	totalDiscount += discountValue;

	receipt += String.format("%20s %10d %10.2f %10.2f%n", items, pieces, price, itemCost);

	sc.nextLine();

	System.out.println("Do you want to add more items?: ");
	String response = sc.nextLine();
	reply = response.equalsIgnoreCase("yes");

	 } while (reply);
	double vatRate = totalCost * 0.175;
	double total = totalCost + vatRate;
             
        System.out.println("Enter the cashier's name: ");
         String cashierName = sc.nextLine();


	System.out.println("============================================================");
	System.out.println("SEMICOLON STORES ");
        System.out.println();
	System.out.println("MAIN BRANCH");
        System.out.println();
	System.out.println("LOCATION: HERBERT MACAULY WAY, SABO YABA, LAGOS.");
        System.out.println();
	System.out.println("TEL: 03293828343");
        System.out.println();
	System.out.println("Date : 18-Dec-22  8 : 48 : 11 pm ");
        System.out.println();
	System.out.println("Cashier: " + cashierName);
        System.out.println(); 
	System.out.println("Customer's Name: " + name);
	System.out.println("_____________________________________________________________");

        System.out.printf("%20s  %10S  %10S   %10s%n", "ITEM", "QTY","PRICE", "TOTAL(NGN)");

	System.out.print(receipt);
	
        System.out.println("=============================================================");

        System.out.printf("%20s  %10.2f%n", "Total Cost:", totalCost);
        System.out.printf("%20s  %10.2f%n", "Discount:", totalDiscount);
        System.out.printf("%20s  %10.2f%n", "VAT @ 17.50%:", vatRate);
        System.out.printf("%20s  %10.2f%n", "Total:", total);
        System.out.println();
        System.out.println("============================================================");
        System.out.println("KIDLY MAKE YOUR PAYMENT");
        System.out.println("____________________________________________________________");

        double amountPaid;
        do {
            System.out.print("Enter the amount paid: ");
            amountPaid = sc.nextDouble();
            if (amountPaid < total) {
            System.out.println("Insufficient payment. Kindly pay the full amount.");
	  }

        } while (amountPaid < total);
		System.out.println("Payment received. Thank you!");

        	double balance = amountPaid - total; 

	System.out.println("==============================================");
	System.out.println("SEMICOLON STORES ");
        System.out.println();
	System.out.println("MAIN BRANCH");
        System.out.println();
	System.out.println("LOCATION: HERBERT MACAULY WAY, SABO YABA, LAGOS.");
        System.out.println();
	System.out.println("TEL: 03293828343");
        System.out.println();
	System.out.println("Date : 18-Dec-22  8 : 48 : 11 pm ");
        System.out.println();
	System.out.println("Cashier Name: " + cashierName); 
        System.out.println();
	System.out.println("Customer's Name: "+ name);
	System.out.println("_________________________________________________________________");

	  System.out.printf("%20s %10s %10s %10s%n", "ITEM", "QTY", "PRICE",    "TOTAL(NGN)");

	System.out.print(receipt);
	
        System.out.println("=================================================================");

        System.out.printf("%20s  %10.2f%n", "Total Cost:", totalCost);
        System.out.printf("%20s  %10.2f%n", "Discount:", totalDiscount);
        System.out.printf("%20s  %10.2f%n", "VAT @ 17.50%:", vatRate);
        System.out.printf("%20s  %10.2f%n", "Total:", total);

       	System.out.println("==================================================================");	
        System.out.printf("%20s %10.2f%n", "Amount Paid:", amountPaid);
        System.out.printf("%20s %10.2f%n", "Balance:", balance);
	
	 System.out.println("_________________________________________________________________");
         System.out.println("   THANK YOU FOR YOUR PATRONAGE !!! ");
	System.out.println("==================================================================");
	
    
  }
}