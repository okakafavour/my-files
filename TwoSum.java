import java.util.Arrays;
 public class TwoSum{
   public static void main(String[] args){

   int[] array = {2,7,11,15};
   int target = 9;
   System.out.println(Arrays.toString(sumIndex( array, target)));


 }

public static int[] sumIndex(int[]array, int target){

  int[] result = new int[2];

for (int count = 0; count < array.length; count++){
for(int j = 0; j < array.length; j++){
 if(array[count] + array[j] == target){

result[0] = count;
result[1] = j;
}
    
}   
 
 }  

return result;
}



}