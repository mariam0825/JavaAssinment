//collect number from user
//use method  to determine the reminder whenfirst number is divived by second number
// return reminder






import java.util.Scanner;
public class dontPerish9{
   public static void main(String[]age){
   Scanner input= new Scanner(System.in);

   System.out.print("Enter number one = ");
    int number1= input.nextInt();

   System.out.print("Enter number two = ");
    int number2 = input.nextInt();

  System.out.println(divide(number1 , number2));

   }
  
  public static int divide(int a , int b){
    int reminder = a % b;
    return reminder;

  }
}
