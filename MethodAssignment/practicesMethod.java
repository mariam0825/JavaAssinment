
public class practicesMethod{
  public static void main(String[]args){
    
    printWelcomeMessage();

   int number = ave(8 , 4,10);
    System.out.println(number);
  
   int doubleit = doubleit(8);
    System.out.println(doubleit);
    
    boolean negative = negative(-4);
    System.out.println(negative);

   boolean range = isRange(8,2,10);
   System.out.println(range);

   multiple(6);

  
   }


   public static void printWelcomeMessage(){
   
    String welcomeMessage= ("Welcome to java");
   System.out.println(welcomeMessage);

  }


   public static int ave(int a, int b, int c){
    int average = a + b + c/3;
    return average;

   }


 public static int doubleit(int n){
    int product = n * 2;
    return product;

   } 


  public static boolean negative (int n){

   if(n > 0)
        return true;
   
 return false;
   }
    
  public static boolean isRange (int n ,int low , int high){
   
     if(n >= 0 && n <= 0)
        return true;
   
 return false;
   }
    public static void multiple(int number){
    int product = 1;
  for(int count = 1; count <= 5; count++){
    product = number * count;
   System.out.println(product); 

              }

        }
   
   }


