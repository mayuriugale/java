import java.util.*;
class Exception
{
   public static void main(String A[])
   {
      Scanner sobj=new Scanner(System.in);
      int no1 =0, no2=0, Ans=0;                                         //integer

        System.out.println("Enter firest number");
             no1=sobj.nextInt();

            System.out.println("Enter secound number");
               no2=sobj.nextInt();
             Ans=no1/no2;                               //excaption proen code
            System.out.println("Division is:"+Ans);              //+ means concatenation
   }
}  
