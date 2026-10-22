import java.util.*;                               //scanner object create

class selection2
{   
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
          int no = 0;
           
        System.out.println("Enter  your age :");
         no = sobj.nextInt();

        if ( no < 18)
        {
            System.out.println(" not ALLOWED");
        }
        else
        {
            System.out.println(" allowed");
        }

    }
}