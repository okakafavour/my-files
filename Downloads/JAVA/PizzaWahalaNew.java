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

int small_money = 0;
int bigBoys = 0;
int odogwu = 0;
int typesOfPizza = 0;

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
     reply = userinput.nextInt(); 

    }

    int numberOfBoxes = 0;

    switch(reply) {
   case 1:
    numberOfBoxes = (int) Math.ceil((double) number / 4);
   System.out.println("Number Of Boxes: "+ numberOfBoxes);

   case 2:  
    numberOfBoxes = (int) Math.ceil((double) number / 6);
   System.out.println("Number of Boxes: "+ numberOfBoxes);
 
  case 3: 
     numberOfBoxes = (int) Math.ceil((double) number / 8);
   System.out.println("Number of Boxes: "+ numberOfBoxes);

 case 4: 
     numberOfBoxes = (int) Math.ceil((double) number / 12);
   System.out.println("Number of Boxes: "+ numberOfBoxes);

      
   