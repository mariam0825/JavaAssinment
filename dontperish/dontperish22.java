// collect number from user
// add 10 to the number and 





import java.util.Scanner;
public class dontPerish2{
   public static void main(String[]age){
   Scanner input= new Scanner(System.in);

   System.out.print("Enter number = ");
    int number = input.nextInt();
    
  System.out.println(add(number));

   }
  
  public static int add(int n){
    int sum = n + 10;
    return sum;

  }
}
