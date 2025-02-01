import java.util.Arrays;

public class ArraysNumber {
    public static void main(String[] args) {
        int[][] array = { {2, 4, 3}, {5, 6, 4} };

        int[] result = number(array);
    System.out.println("the sum" + Arrays.toString(result));
   }
   public static int[] number(int[][] array){
    
   int columns = array[0].length;
   int[] newArray = new int[columns]; 

  for (int col = 0; col < columns; col++) {
    for(int row = 0; row < array.length; row++){
       
     newArray[col] += array[row][col];
  
 
  }
 for (int counter = newArray.length ; counter < newArray.length -1; counter--) {
     result += array[counter];
}
 
  }
 return result;
}                                                                          
 }