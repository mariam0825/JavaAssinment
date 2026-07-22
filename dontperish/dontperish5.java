//collect two number from user
// use method to determine if number one and two are equal 
// return true  else return false




import java.util.Scanner;
public class dontpPerish15{
  public static void main(String[]args){
   Scanner input = new Scanner(System.in);
    System.out.print("Enter number one = ");
    int number1 = input.nextInt();
   
   System.out.print("Enter number two = ");
    int number2 = input.nextInt();
    
  System.out.println(value(number1 , number2));

}
public static boolean value(int a , int b){

   if(a == b )
        return true;
   
 return false;
   }
}



