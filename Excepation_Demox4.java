import java.uitl.*;
class Excepation_Demo4
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
    catch(ArithmeticException aobj)

    {
       System.of.println("inside generic catch");

    }
    finally
    {
      System.out.println("inside finally block");
    }
     System.out.println("End of main");
  }
   System.out.println("division is :"+Ans)  
  }











