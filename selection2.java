import java.util.*;                               //scanner object create

class selection2
{   
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
          int no = 0;
           
        System.out.println("Enter  your age :");
         no = sobj.nextInt();

        if(No >= 18)
        {
            System.out.println("ALLOWED");
        }
        else
        {
            System.out.println("not allowed");
        }

    }
}