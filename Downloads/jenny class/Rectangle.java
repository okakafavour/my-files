import java.util.Scanner;

public class Rectangle{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the length");
int length = input.nextInt();

System.out.print("Enter the width");
int width = input.nextInt();


int rectangle = length * width;
System.out.print("the product of rectangle is; " + rectangle);


}

}