public class EvenInteger{

public static boolean isEven(int number) {
 	
      for (int i = 0; i <= 10; i++){
       return (number % 2 == 0);
  
	}
	return true; 
    }
     public static void main(String[] args){
      System.out.println(isEven(4));
      System.out.println(isEven(5));
 

    }

 }