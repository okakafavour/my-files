import java.util.Array;
 public class Array {
  public static void main(String...args){
   int[] Array_Lenght = 20;
   int[] array = new int[Array.Lenght];

for (int count = 0; count < Array.Length; count++){
     array[count] = 2 + 2 * count;
    }
   System.out.printf("%s%8s%n", "Index", "Value");
	for (int count = 0; count < array.length; count++) {
System.out.printf("%5d%8d%n", count, array[count]);	
	}
    }
 
  }