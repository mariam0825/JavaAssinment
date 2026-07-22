//collect two number from user 
// use method to determine which number is larger among the two number 
// return first number else return second number





import java.util.Scanner;
public class dontPerish13{
   public static void main(String[]age){
   Scanner input= new Scanner(System.in);

   System.out.print("Enter number one = ");
    int number1= input.nextInt();

   System.out.print("Enter number two = ");
    int number2 = input.nextInt();

  System.out.println(larger(number1 , number2));

   }
  
  public static int larger(int a , int b){
    if (a > b){
  return a ;
    }else{
   return b;
   }
  }
}
