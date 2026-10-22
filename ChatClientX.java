import java.io.*;
import java.net.*;

class ChatClientX
{
    public static void main(String A[]) 
    {
        try
        {


                Socket sobj = new Socket("localhost", 5100);

                System.out.println("Client connected with Server successfully");

                PrintStream popj =
                    new PrintStream(sobj.getOutputStream());

                BufferedReader bobj1 =
                    new BufferedReader(
                        new InputStreamReader(sobj.getInputStream()));

                BufferedReader bobj2 =
                    new BufferedReader(
                        new InputStreamReader(System.in));

                System.out.println("Marvellous client is running");

                String str1 = null, str2 = null;

                System.out.println("Enter message for server:");

                while (!(str1 = bobj2.readLine()).equals("end"))
                {
                    popj.println(str1);

                    str2 = bobj1.readLine();

                    System.out.println("Server says : " + str2);

                    System.out.println("Enter message for server:");
                }
                        pobj.close();
                        bobj1.close();
                        bobj2.close();
                        sobj.close();
                       
             }//end of try
             catch(Exception eobj)
             {
                System.out.println(eobj);
             }//end of main
            }
        }//end class
