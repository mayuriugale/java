import java.util.*;
class Excepation_Demoxx
{
  public static void main( String A[])
  {
    
    Scanner sobj = new Scanner(System.in);
       
    int Arr[] ={11,21,101,111};

    int index = 0;
  
    try
    {
    System.out.println("Enter the index");
     index= sobj.nextInt();
    
     System.out.println("Element is:"+Arr[index]);
    }
    catch(ArrayIndexOutOfBoundsException aobj)
    {
      System.out.println("inside catch:"+ aobj);
    }
     System.out.println("End of main");
  }
  }


  











