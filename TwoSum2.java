import java.util.Arrays;

public class TwoSum2{

public static void main(String[] args){

int[] array = {3,2,4};
int target = 6;


System.out.println(Arrays.toString(sumOfIndex(array, target)));
 
   }
  public static int[] sumOfIndex(int[]array, int target){
	int[] result = new int[2]; 

  for(int count = 0; count < array.length; count++){
  for (int counter = 0; counter < array.length; counter++){

	if (array[count] + array[counter] == target){
       result[0] = count;
       result[1] = counter;
        }
    

     }
 
         }
      return result; 
     }

 }