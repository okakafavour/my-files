import java.util.Scanner;

public class Greetings{

public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.print("""

Enter the greeting listed below;

case 1 :  Good morning;

case 2 :  Eka ro;

case 3 : Kadankadan;

""");

int userinput = input.nextInt();

switch(userinput) {

case 1 : System.out.print("Good morning");
	break;

case 2 : System.out.print("Eka ro");
	break;

case 3 :System.out.print("Kadankadan");
	break;

}































}


}