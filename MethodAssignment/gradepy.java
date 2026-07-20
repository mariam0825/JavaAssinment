//collect three scores from users
// calculate the avaerage
// if average 90 less than equal to 100 print A
//else if average 80 less thsn equql to 90 print B
// else if average 70 less than equal to 80 print C
// else if average  60 less than equal to 70 print D
//else average 60 print F






import java.util.Scanner;
public class fatherage{
   public static void main(String[]age){
   Scanner input= new Scanner(System.in);

   System.out.print("student score = ");
    int studentScore = input.nextInt;

    System.out.print("student scoree2 = ");
    int studentScore2 = input.nextInt;
 
     System.out.print("student score3 = ");
    int studentScore3 = input.nextInt;

   
   int average = ((studentScore + studentScore2 + studentScore3)/3);
 
   if (90 <= average && average <=100){
    System.out.print("A");
   }
   else if (80 <= average && average < 90){
   System.out.print("B");
   }
   else if (70 <= average && average < 80){
    System.out.print("C")
     }
   else if ( 60 <= average < 70){
    System.out.print("D")
    }
   else {
   System.out.print("F")

   }

}
}
   
