
 public class TwoArrays{
 public static void main(String[] args){
int[] numb1 = {2, 3, 4, 7};
int[] numb2 = {1, 5, 8, 9};
int[] combArray = new int[numb1.length + numb2.length];

int count = 0;
for (int i = 0; i < numb1.length; i++){
 combArray[i] = numb1[i];	
	
	}
	for (int i = numb1.length; i < combArray; i++){
		combArray[i] = numb2[count];
		
	}
	
	}
 }
 
