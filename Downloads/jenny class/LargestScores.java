import java.util.Scanner;

 public class LargestScores{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter first_score: ");
int first_score = input.nextInt();

System.out.print("Enter second_score: ");
int second_score = input.nextInt();

System.out.print("Enter third_score: ");
int third_score = input.nextInt();

System.out.print("Enter fourth_score: ");
int fourth_score = input.nextInt();

System.out.print("Enter fifth_score: ");
int fifth_score = input.nextInt();


if ( first_score > second_score && first_score > third_score && first_score > fourth_score && first_score > fifth_score){
System.out.println(" largest_score: " + first_score);
}
else if (second_score > first_score && second_score > third_score && second_score > fourth_score &&  second_score > fifth_score){
System.out.println(" Largest_score: " + second_score);
}
else if (third_score > first_score && third_score > second_score && third_score > fourth_score && third_score > fifth_score){
System.out.println(" Largest_score: " + third_score);
}
else if (fourth_score > first_score && fourth_score > second_score && fourth_score > third_score && fourth_score > fifth_score){
System.out.println(" Largest_score: " + fourth_score);
}
else if (fifth_score > first_score && fifth_score > second_score && fifth_score > third_score && fifth_score > fourth_score){
System.out.println(" Largest_score: " + fifth_score);
}



}



}