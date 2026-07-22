// collect two number from user
// use method to determine which number is the smaller amog the two number
// return first number else return second number





import java.util.Scanner;
public class dontPerish13{
   public static void main(String[]age){
   Scanner input= new Scanner(System.in);

   System.out.print("Enter number one = ");
    int number1= input.nextInt();

   System.out.print("Enter number two = ");
    int number2 = input.nextInt();

  System.out.println(smaller(number1 , number2));

   }
  
  public static int smaller(int a , int b){
    if (a < b){
  return a ;
    }else{
   return b;
   }
  }
}
