import java.util.Scanner;

public class PizzaWahalaNew{

public static void main(String[] args){

Scanner userinput = new Scanner(System.in);

 System.out.print("Enter number of people: ");
int number = userinput.nextInt();

while (number <= 0) {
 System.out.println("invalid input.Please enter a valid input: ");
number = userinput.nextInt();

}

System.out.print("""

    ENTER THE TYPE OF PIZZA FOR THE MENU

    S/N       PIZZA TYPES      SLICES       AMOUNT

    1.        sapa size          4          2,500
    2.        small money        6          2,900
    3.        big boys           8          4,000
    4.        odogwu             12         5,200

""");
    
   
   System.out.print("Enter number of the type of pizza: ");
   int reply = userinput.nextInt();
   
   while (reply < 1) // (reply > 4) {
    System.out.println("Invalid input.Enter (1 - 4): ");

    

    int numberOfBoxes = 0;
    int priceOfBoxes = 0;
	int slicesRemaining = 0;
   switch(reply) {
   case 1:
    numberOfBoxes = (int) Math.ceil((double) number / 4);
    slicesRemaining = (numberOfBoxes * 4) - number;
    priceOfBoxes = numberOfBoxes * 2500;
	break;
	
   case 2:  
    numberOfBoxes = (int) Math.ceil((double) number / 6);
    priceOfBoxes = numberOfBoxes * 2900;
   slicesRemaining = (numberOfBoxes * 6) - number;
   break;
 
  case 3: 
    numberOfBoxes = (int) Math.ceil((double) number / 8);
    slicesRemaining = (numberOfBoxes * 8) - number;
    priceOfBoxes = numberOfBoxes * 4000;
 break;
 
 case 4: 
    numberOfBoxes = (int) Math.ceil((double) number / 12);
   slicesRemaining = (numberOfBoxes * 8) - number; 
   priceOfBoxes = numberOfBoxes * 5200;
   break;
   
   }
    System.out.println("Number of Remaining Slices: "+ slicesRemaining);  
	System.out.println("Number of Boxes: "+ numberOfBoxes);
	System.out.println("Price Of Box: "+ priceOfBoxes);
 }
}
