public class Question1 {
 public static void main(String[] args){

int inputOne = 4;
int inputTwo = 2;
int result =0;

 System.out.println(number(result));

  }
 public static int number(int number){
int inputOne = 125;
int inputTwo = 2525;
int result = 0;

  for (int count = 1; count <= inputOne && count <= inputTwo; count++) {
      if (inputTwo % count == 0  && inputOne % count == 0 ){
      result += count;
}

}
return result;
   }

}