import java.util.Arrays;
public class TwoSum3{
 public static void main(String[] args){

  int[] array ={3,3};
  int target = 6;
  
 System.out.println(Arrays.toString(sumOfIndex( array, target)));

  }
   public static int[] sumOfIndex(int[]array, int target){
int[] result  = new int[2];
  for(int count = 0; count < array.length; count++){
  for (int counter = 0; counter < array.length; counter++){
	if (array[count] + array[counter] == target){

result[0] = count;
result[0] = counter;
}


  }
      
       }
	return result;
    } 
 }
