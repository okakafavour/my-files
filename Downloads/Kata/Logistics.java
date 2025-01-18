import java.util.Scanner;
  public class Logistics {
   public static void main(String...args){

   Scanner sc = new Scanner(System.in);
   System.out.println("""
   
   Collection Rate      Amount Per Parcel       Base Pay 
     
    Less than 50%           160                  5,000
     50 - 59%               200                  5,000
     60 - 69%               250                  5,000
      >= 70%                500                  5,000

  """);
  
   System.out.println("Enter the successful delivery the rider had for the day: ");
   int delivery = sc.nextInt();
    
  

  while (true) {
   if (delivery < 1) {
    System.out.println("Invalid input.Enter valid input: ");
    delivery = sc.nextInt();
    } else {

     if (delivery < 50){
      int result = delivery * 160 + 5000;
  System.out.printf("%s  %d%n","Rider's wages:", result); 
  break;
         } else if (delivery < 59){
     int result = delivery * 200 + 5000;
    System.out.printf("%s  %d%n","Rider's wages:", result);
    break;
    } else if (delivery < 69){
    int result = delivery * 250 + 500;
   System.out.printf("%s  %d%n","Rider's wages:", result);
   break;
    } else if (delivery >= 70){
     int result = delivery * 500 + 5000; 
   System.out.printf("%s  %d%n","Rider's wages:", result);
   }
       }
    }
  }
}