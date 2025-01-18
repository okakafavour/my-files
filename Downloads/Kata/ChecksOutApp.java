import java.util.Scanner;

public class ChecksoutApp {
	public static void main(String...args){

	Scanner userInput = new Scanner(System.in);

	System.out.println("What is the customer's Name? ");
	String name = userInput.nextLine();

	System.out.print("Enter the cashier's name: ");
         String cashierName = userInput.nextLine();

	double totalDiscount = 0;
	double totalCost = 0;
	boolean reply;
	String receipt = "";
	
      do {

	System.out.print("What did the user buy?");
	String item = userInput.nextLine();

	System.out.print("How many pieces do you want to buy?");
	int pieces = userInput.nextInt();
	if (pieces <= 0) {
            System.out.println("Invalid input,Please enter valid input");
	  }

	System.out.print("How much per unit?");
	double price = userInput.nextInt();

	double itemCost = pieces * price;

	System.out.print("How much discount are you applying(in percentage): ");
	double discountinput = userInput.nextDouble();

	double discount = (discountinput / 100) * itemCost;
	totalCost += itemCost - discount;
	totalDiscount += discount;

	receipt += String.format("%20s  %10.2f  %10.2f%n", item, quantity, price, itemCost);

	userInput.nextLine();

	System.out.print("Do you want to add more items?");
	String response = userInput.nextLine();
	reply = response.equalsIgnoreCase("yes");

	} while(reply);
	double vatRate = totalCost * 0.175;
	double total = totalCost + vatRate;


	System.out.println(""", 
======================================================================
	SEMICOLON STORES
        
	MAIN BRANCH
        
	LOCATION: HERBERT MACAULY WAY, SABO YABA, LAGOS
	TEL: 03293828343
        
	Date : 18-Dec-22  8 : 48 : 11 pm 

""");

	System.out.println("Cashier: " + cashierName); 
	System.out.println("Customer's Name: " + name);
	System.out.println("===============================================");

        System.out.printf("       ITEM     QTY     PRICE     TOTAL(NGN)");

	System.out.print(receipt);
	
        System.out.println("==============================================");

        System.out.println("Total Cost: "+ totalCost);
        System.out.println("Discount: "+ totalDiscount);
        System.out.println("VAT @ 17.50%: "+ vatRate);
        System.out.println("Total: "+ total);
        System.out.println("KINDLY MAKE YOUR PAYMENT");
        System.out.println("===============================================");

        double amountPaid;
        do {
            System.out.print("Enter amount paid: ");
            amountPaid = userInput.nextDouble();
            if (amountPaid < total) {
            System.out.println("Insufficient payment. Kindly pay the full payment.");
	  }

        } while (amountPaid < total);
		System.out.println("Payment received. Thank you for coming!!!");

        	double balance = amountPaid - total; 

	System.out.println("""
======================================================================
	SEMICOLON STORES
        
	MAIN BRANCH
        
	LOCATION: HERBERT MACAULY WAY, SABO YABA, LAGOS
	TEL: 03293828343
        
	Date : 18-Dec-22  8 : 48 : 11 pm 

""");
        
	System.out.println("Cashier: " + cashierName); 
	System.out.println("Customer's Name: " + name);
        
	System.out.println("============================================");

	  System.out.printf("      ITEM     QTY     PRICE     TOTAL(NGN)");
 
	System.out.print(receipt);
	
        System.out.println("==============================================");

        System.out.println("Total Cost: "+ totalCost);
        System.out.println("Discount:", + totalDiscount);
        System.out.println("VAT @ 17.50%:" , + vatRate);
        System.out.println("Total:", + total);
        System.out.println("KINDLY MAKE YOUR PAYMENT");
        System.out.println("==============================================");



       	System.out.println("===============================================");	
        System.out.printf("%-25s %-10.2f\n", "Amount Paid:", amountPaid);
        System.out.printf("%-25s %-10.2f\n", "Balance:", balance);
	
	 System.out.println("===============================================");
          System.out.println("THANK YOU FOR YOUR PATRONAGE ");
	System.out.println("===============================================");
	
    
  }
}