
    public class method{
       public static void main (String[]args){
     int sumResult = add(10,5);
     int subtract = subtract(12, 7);
     int divisonResult = divison(10, 2);
     int multipleResult = multiple(8,4);

     System.out.println(divisonResult);
     System.out.println(sumResult);
     System.out.println(subtractResult);
     System.out.println(multipleResult);
  }
  public static  int add(int a, int b){
    int sum = a+b;
      return sum;

   }
  public static int subtract(int a, int b){
    int sub = a - b;
     return sub;

    }
  public static int divison(int a , int b){
     int divison = a/b;
      return divison;
   }
  public static int product(int a, int b){
    int product = a*b;
    return product;


   }

}
}
