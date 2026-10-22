import java.util.*;
class Excepation_Demo3
{
  public static void main( String A[])
  {
    
    int no1=0,no2=0, Ans=0;
    try
    {
      Scanner sobj = new Scanner(System.in);
        System.out.println("Enter first number");
          no1 = sobj.nextInt();
        System.out.println("Enter secound number ");
           no2 = sobj.nextInt();

              Ans=no1/no2;
     
    }
    catch(ArithmeticException aobj)                                       //

    {
       System.out.println("Exception on occur " +aobj);                    

    }
    finally 
    {
      System.out.println("inside finally block");
    }
     System.out.println("End of main");


  }
}










