public class ConcatenatesTwoArray{

public static void concatenatesTwoLists(int[] numbers) {

String[] first_array ={"a", "b", "c"};
int[] second_array ={1, 2, 3};

int[] result_array = new int[first_array.length + second_array.lenght];

for (int i = 0; i < first_array.lenght; i++){
   result_array[i] = first_array[i];
       }
 for (int i = 0; i < result_array.lenght; i++){
 result_array[first_array + i] = new_array[i];
       }
for (int num : result_array){
System.out.print(num + "  ");
        }
    }

 }